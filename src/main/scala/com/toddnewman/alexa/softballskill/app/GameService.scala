package com.toddnewman.alexa.softballskill.app

import com.toddnewman.alexa.softballskill.data.GameData.games
import com.toddnewman.alexa.softballskill.data.TeamData.teams
import com.toddnewman.alexa.softballskill.data.Schema.Game

object GameService {

  lazy val noGame = new Game(0, 0, 0, java.time.LocalDateTime.now(), 0, 0, 0)

  /*
   * Returns games a team participated in
   *
   * Notice the use of the short form anonymous function in teamGames() vs the long form in teamGamesPast()
   * long form is { g => g.field == 10 }
   * short form is { _field == 10 }
   */
  def teamGames(teamId: Int): Seq[Game] = games.filter { _.isParticipant(teamId) } sortBy(_.startAsJavaDate)
  def teamGamesPast(teamId: Int): Seq[Game] = teamGames(teamId).filter { g => g.inPast }

  /*
   * Returns a map of a team ID to that team's games
   * Used in initial SOS calculation, left in because of the conciseness
   *
   * 100s of ways to do this.  Find some others; no doubt lots of better ways
   *
   * What I did is create a tuple for each game (homeId, game) and (visitingId, game)
   * If I had used map I would have had a sequence of sequences after the first line
   * (each of the inner sequences would have had the two tuples resulting from a single game)
   * flatMap "flattens" the result so I have a sequence of tuples
   *
   * With that I just needed to create a map. I found the second line on stackexchange which works beautifully
   * I'm a little concerned about using mapValues because it does weird things under the covers
   * But I left it for now because of the pretty conciseness of it all
   */
  def mapTeamToGames(): Map[Int, Seq[Game]] = {
    val teamToGameTuples = games.flatMap(g => Seq(g.homeId -> g, g.visitingId -> g))
    teamToGameTuples.groupBy(_._1).mapValues(_.map(_._2))
  }

  /*
   * returns the last game played for a team
   *
   * notice we return an Option because there might be no last game
   *
   * notice the collection method maxBy which picks the highest value of the
   * evaluation of the anonymous function on each element
   */
  def previousGame(teamId: Int): Option[Game] = {
    val pastGames = teamGamesPast(teamId)
    if (pastGames.length > 0) Some(pastGames.maxBy(_.startAsJavaDate)) else None
  }

  /*
   * returns the next game a team will play
   *
   * once again return an Option because there might be no next game
   *
   * minBy of course is analogous to maxBy in the prior function
   * I used the long form in the minBy function just for variety
   */
  def nextGame(teamId: Int): Option[Game] = {
    val futureGames = teamGames(teamId).filter { _.inFuture }
    if (futureGames.length > 0) Some(futureGames.minBy(g => g.startAsJavaDate)) else None
  }

  /*
   * Given a game and team ID, return the name of the opponent
   * I thought this would be a fun thing to ask Alexa, plus I finally get a place to show pattern matching
   *
   * NOTE: I take an Option[Game] because the API above that returns a Game is in an Option
   * NOTE: I found the pattern match with get more concise than wart remover's suggestion. Maybe it's me
   */
  @SuppressWarnings(Array("org.wartremover.warts.OptionPartial"))
  def getOpponentNameFromGame(game: Option[Game], teamId: Int): Option[String] = {
    // NOTE: pattern match is considered overkill here
    // getOrElse or fold are the preferred patterns
    game match {
      case g: Some[Game] => Some(teams.find(_.id == g.get.opponentId(teamId)).get.name)
      case _ => { None }
    }
  }


  /*
   * Below are methods which call the above API for my team
   */
  def myTeamId: Int = TeamService.myTeamId

  def myPreviousGame: Option[Game] = previousGame(myTeamId)
  def myNextGame: Option[Game] = nextGame(myTeamId)

  def myLastOpponent: Option[String] = getOpponentNameFromGame(myPreviousGame, myTeamId)
  def myNextOpponent: Option[String] = getOpponentNameFromGame(myNextGame, myTeamId)

  def myGames: Seq[Game] = teamGames(myTeamId)

  def myTeamRunsScored: Int = myGames.foldLeft (0) { (runs, g) => runs + g.myScore(myTeamId) }
  def myTeamRunsScored2: Int = myGames.map { g => g.myScore(myTeamId) } sum
  def myOpponentsRunsScored: Int = myGames.foldLeft (0) { (runs, g) => runs + g.opponentScore(myTeamId) }

}
