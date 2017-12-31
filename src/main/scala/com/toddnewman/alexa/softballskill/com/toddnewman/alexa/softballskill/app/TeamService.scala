package com.toddnewman.alexa.softballskill.app

import com.toddnewman.alexa.softballskill.app.GameService.{teamGames, teamGamesPast}
import com.toddnewman.alexa.softballskill.data.PlayerData.players
import com.toddnewman.alexa.softballskill.data.TeamData.teams

object TeamService {

  /*
   * returns names of players on the team of playerId (excluding the self)
   */
  def teammateNames(playerId: Int) = {
    val teamId = players.find { _.id == playerId }.get.teamId
    val teamPlayers = players.filter { _.teamId == teamId }.filterNot { _.id == playerId }
    teamPlayers.map { _.name }
  }

  /*
   * Returns names of teams competed against
   *
   * toMap at the end of the first line converts the sequence of tuples returned from the map() function to a map
   *
   * Notice I use the long for in the anonymous function
   * this is necessary because the same parameter (t) is referenced twice
   */
  def teamOpponents(teamId: Int) = {
    val teamMap = teams.map { t => t.id -> t.name } toMap
    val opponentIds = teamGames(teamId).map { _.opponentId(teamId) }
    opponentIds.map { teamMap(_) }
  }

  /*
   * Returns IDs of past opponents
   */
  def teamOpponentIdsPast(teamId: Int) = teamGamesPast(teamId) map { g => g.opponentId(teamId) }

  /*
   * returns a tuple of (wins, lossees) for a team
   * NOTE: ties = losses because who cares about ties?
   *
   * foldLeft is like reduce but with a starting value
   * in this case (0, 0)
   * the initial value must be in parens, the tuple too
   * that's why you see double parens
   */
  def winLossRecord(teamId: Int) = {
    teamGames(teamId).foldLeft ((0, 0)) { (winLoss, g) =>
      if (g.myScore(teamId) > g.opponentScore(teamId)) (winLoss._1 + 1, winLoss._2)
      else (winLoss._1, winLoss._2 + 1)
    }
  }

  /*
   * returns a map of team ID to strength of schedule
   * NOTE: SOS should include opponents' opponents' record, not the point here
   * it's already my longest method!
   *
   * the case() in the teamIdToWinPercentage definition line lets us separate and access the key and value in the function
   * I think it's a similar mechanism to pattern matching
   */
  def sos() = {
    // maps to use later
    val teamIds = teams.map(_.id)
    val teamIdToRecord = teamIds.map { id => id -> winLossRecord(id) } toMap

    // create a map of team ID to win percentage which = wins / (wins + losses)
    // NOTE: don't use mapValues because it doesn't really transform, it provides a view
    val teamIdToWinPercentage = teamIdToRecord.map { case(id, winLoss) => id -> winLoss._1.toDouble / (winLoss._1 + winLoss._2).toDouble }

    teamIds.map { id =>
      // get win percentage of all opponents
      val opponentWinPercentages = teamOpponentIdsPast(id).map(teamIdToWinPercentage(_))
      // average using convenience collection methods
      id -> (opponentWinPercentages.sum / opponentWinPercentages.length.toDouble)
    } toMap
  }

  /*
   * Returns SOS for an individual team
   *
   * a convenience method
   * the first set of parentheses are needed so the compiler doesn't confuse teamId with a parameter for the sos function
   * (It's actually a call to apply on the resulting map)
   */
  def teamSos(teamId: Int) = sos()(teamId)

  // TODO: sos rank


  /*
   * Below are methods which call the above API for my team as defined by myPlayerId
   */

  def myTeamId() = PlayerService.myPlayerRecord.teamId
  def myTeamDetails() = teams.find(_.id == myTeamId).get
  def myTeamName() = myTeamDetails().name

  def myTeammateNames() = teammateNames(PlayerService.myPlayerId)
  def myTeammateNamesFormatted() = myTeammateNames.sorted mkString(",")

  def myOpponents() = teamOpponents(myTeamId)
  def myWinLossRecord() = winLossRecord(myTeamId)
  def myTeamSos() = teamSos(myTeamId)

}
