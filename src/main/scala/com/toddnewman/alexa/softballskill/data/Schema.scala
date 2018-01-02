package com.toddnewman.alexa.softballskill.data

import java.time.LocalDateTime

object Schema {
  object Position extends Enumeration {
    type Position = Value
    val Infield, Outfield, Catcher = Value
  }
  import Position._

  final case class Player(id: Int, teamId: Int, firstName: String, lastName: String, position: Position, battingOrder: Int) {
    def name: String = firstName + " " + lastName
  }

  final case class Team(id: Int, name: String, color: String, captainId: Int)

  final case class Game(id: Int, homeId: Int, visitingId: Int, gameStartTime: LocalDateTime, homeScore: Int, visitingScore: Int, inningCount: Int) {
    import java.util.Date
    def isParticipant(teamId: Int): Boolean = (homeId == teamId || visitingId == teamId)
    def opponentId(teamId: Int): Int = if (homeId == teamId) visitingId else homeId
    def myScore(teamId: Int): Int = if (homeId == teamId) homeScore else visitingScore
    def opponentScore(teamId: Int): Int = if (homeId == teamId) visitingScore else homeScore
    def startAsJavaDate: Date = {
      import java.time.ZoneId
      Date.from(gameStartTime.atZone(ZoneId.systemDefault()).toInstant())
    }
    def inPast: Boolean = gameStartTime.isBefore(LocalDateTime.now)
    def inFuture: Boolean = !inPast
  }

  // example of an implicit
  // adds functionality to an existing class
  implicit class PlayerDescriptiveOutputs(p: Player) {
    def idAndName: String = s"${p.id}: ${p.name}"
    def description: String = s"${p.name}: plays ${p.position} and bats ${p.battingOrder}"
  }



  // More data - maybe fill them with values using https://github.com/justwrote/scala-faker
  //case class HalfInning(id: Int, gameId: Int, inningNumber: Int, isHome: Boolean)
  //case class AtBat(id: Int, gameId: Int, inningNumber: Int, playerId: Int, inning: Int, outs: Int, playersOnBase: Int, result: AtBatResult, rbiCount: Int)
  //  object AtBatResult extends Enumeration {
  //    type AtBatResult = Value
  //    val StrikeOut, Single, Double, Triple, HomeRun = Value
  //  }
  //  import AtBatResult._

  // Maybe some abstractions too?
  // class TeamSchedule
  // class TeamResults
  // class Standings
  // class Inning
  // class PlayerResults
}
