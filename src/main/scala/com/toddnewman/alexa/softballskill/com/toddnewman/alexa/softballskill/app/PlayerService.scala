package com.toddnewman.alexa.softballskill.app

import com.toddnewman.alexa.softballskill.data.PlayerData.players

object PlayerService {

  // Drop your ID in here. 60 = Todd
  val myPlayerId = 60

  def myPlayerRecord() = players.find(_.id == myPlayerId).get
  // slightly less good options
  // def myPlayerRecord() = players.filter { _.id == myPlayerId }(0)
  // def myPlayerRecord() = players.filter { _.id == myPlayerId }.head

  def myCaptainName() = {
    val myTeamCaptainId = TeamService.myTeamDetails.captainId
    if (myTeamCaptainId == myPlayerId) myPlayerRecord.name
    else players.find(_.id == myTeamCaptainId).get.name
  }

}
