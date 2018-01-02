package com.toddnewman.alexa.softballskill.app

import com.toddnewman.alexa.softballskill.data.PlayerData.players
import com.toddnewman.alexa.softballskill.data.Schema.{Player,Position}

object PlayerService {

  // Drop your ID in here. 60 = Todd
  val myPlayerId: Int = 60

  lazy val noPlayer: Player = new Player(0, 0, "No", "Player", Position.Catcher, 0)

  def myPlayerRecord: Player = players.find(_.id == myPlayerId).getOrElse(noPlayer)
  // slightly less good options
  // def myPlayerRecord() = players.filter { _.id == myPlayerId }(0)
  // def myPlayerRecord() = players.filter { _.id == myPlayerId }.head

  /*
   * returns name of team captain
   */
  def myCaptainName: String = {
    val myTeamCaptainId = TeamService.myTeamDetails.captainId
    if (myTeamCaptainId == myPlayerId) myPlayerRecord.name
    else players.find(_.id == myTeamCaptainId).getOrElse(noPlayer).name
  }

  /*
   * returns names of players on the team of playerId (excluding the self)
   */
  def teammateNames(playerId: Int): Seq[String] = {
    val teamId = players.find { _.id == playerId }.getOrElse(noPlayer).teamId
    val teamPlayers = players.filter { _.teamId == teamId }.filterNot { _.id == playerId }
    teamPlayers.map { _.name }
  }

  /*
   * Below are methods which call the above API for my team as defined by myPlayerId
   */

  def myTeammateNames: Seq[String] = teammateNames(PlayerService.myPlayerId)
  def myTeammateNamesFormatted: String = myTeammateNames.sorted mkString(",")

}
