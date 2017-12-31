package com.toddnewman.alexa.softballskill.data

import com.toddnewman.alexa.softballskill.app.{GameService, TeamService, PlayerService}
import org.scalatest._

class TeamDataTests extends FlatSpec with Matchers {

  val playerService = PlayerService
  val teamService = TeamService
  val gameService = GameService

  // hard-coded these values b/c the assertions below depend on them
  val testPlayerId = 60 // PlayerService.myPlayerId
  val testTeamId = 3 //TeamService.myTeamId

  "Captain for player #" + testPlayerId + " " should " be Jared Peace " in {
    val captain = playerService.myCaptainName
    captain should be ("Jared Peace")
  }

  "Games including team #" + testTeamId + " " should " number 4 " in {
    val games = gameService.teamGames(testTeamId)
    games.length should be (4)
  }
  it should " include a game against team #1" in {
    val games = gameService.teamGames(testTeamId)
    games.exists(_.opponentId(testTeamId) == 1)
  }

  "Team #" + testTeamId + " " should " have a win/loss of 2/2 " in {
    val winLoss = teamService.winLossRecord(testTeamId)
    winLoss._1 should be (2)
    winLoss._2 should be (2)
  }

  "Team #" + testTeamId + " " should " have an SOS of 0.5625 " in {
    val sos = teamService.teamSos(testTeamId)
    sos should be (0.5625)
  }

  "Team #" + testTeamId + " previous game " should " be against GoldSchluggers " in {
    val lastOpponent = gameService.getOpponentNameFromGame(gameService.myPreviousGame, testTeamId).get
    lastOpponent should be ("GoldSchluggers")
  }

}