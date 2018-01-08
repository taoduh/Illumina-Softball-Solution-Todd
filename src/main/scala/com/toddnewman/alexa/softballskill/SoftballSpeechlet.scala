package com.toddnewman.alexa.softballskill

import com.amazon.speech.json.SpeechletRequestEnvelope
import com.amazon.speech.ui.{OutputSpeech, PlainTextOutputSpeech, Reprompt, SimpleCard}
import com.amazon.speech.speechlet.{IntentRequest, LaunchRequest, Session, SessionEndedRequest, SessionStartedRequest, SpeechletRequest, SpeechletResponse, SpeechletV2}
import com.toddnewman.alexa.softballskill.app.{PlayerService, TeamService, GameService}

class SoftballSpeechlet extends SpeechletV2 {
  import SoftballSpeechlet._

  // this value must exist in Intent Schema and Sample Utterances
  val playMeIntentName = "PlayMeCoach"
  val teammateIntentName = "TeammateList"
  val recordIntentName = "RecordSoFar"
  val sosIntentName = "ScheduleOfStrength"
  val nextOpponentIntentName = "NextOpponent"
  val lastOpponentIntentName = "LastOpponent"
  val predictionIntentName = "ChampPrediction"

  /*
   * speechlet interface
   */
  override def onSessionStarted(requestEnvelope: SpeechletRequestEnvelope[SessionStartedRequest]): Unit = {
    logEvent("onSessionStarted", requestEnvelope.getRequest, requestEnvelope.getSession)
  }

  override def onLaunch(requestEnvelope: SpeechletRequestEnvelope[LaunchRequest]): SpeechletResponse = {
    logEvent("onLaunch", requestEnvelope.getRequest, requestEnvelope.getSession)
    getAskResponse("Softball Bot", "Welcome to the Softball Bot, ask me a question")
  }

  @SuppressWarnings(Array("org.wartremover.warts.Var", "org.wartremover.warts.Null"))
  override def onIntent(requestEnvelope: SpeechletRequestEnvelope[IntentRequest]): SpeechletResponse = {
    logEvent("onIntent", requestEnvelope.getRequest, requestEnvelope.getSession)

    val intent = requestEnvelope.getRequest.getIntent
    val thisIntentName = if (intent != null) intent.getName else null

    if (thisIntentName == playMeIntentName) getTextResponse(thisIntentName, playMeIntentSpeech)
    else if (thisIntentName == teammateIntentName) getTextResponse(thisIntentName, teammateIntentSpeech)
    else if (thisIntentName == recordIntentName) getTextResponse(thisIntentName, recordIntentSpeech)
    else if (thisIntentName == sosIntentName) getTextResponse(thisIntentName, sosIntentSpeech)
    else if (thisIntentName == nextOpponentIntentName) getTextResponse(thisIntentName, nextOpponentIntentSpeech)
    else if (thisIntentName == lastOpponentIntentName) getTextResponse(thisIntentName, lastOpponentIntentSpeech)
    else if (thisIntentName == predictionIntentName) getTextResponse(thisIntentName, predictionIntentSpeech)
    else getAskResponse("Softball Bot", "I don't know how to play the game, ask me something I know.")
  }

  override def onSessionEnded(requestEnvelope: SpeechletRequestEnvelope[SessionEndedRequest]): Unit = {
    logEvent("onSessionEnded", requestEnvelope.getRequest, requestEnvelope.getSession)
  }

  /*
   * intent speech responses
   */
  private def playMeIntentSpeech() = s"Put me in coach ${PlayerService.myCaptainName}, I'm ready to play"

  private def teammateIntentSpeech() = s"Your crew includes ${PlayerService.mySomeTeammateNamesFormatted}"

  private def recordIntentSpeech() = {
    val winLoss = TeamService.myWinLossRecord
    s"This season you have ${winLoss._1} wins and ${winLoss._2} losses"
  }

  private def sosIntentSpeech() = s"You have played some tough teams and have a strength rating of ${TeamService.myTeamSos}"

  private def nextOpponentIntentSpeech() = {
    GameService.myNextOpponent
      .map(opponent => s"Next up is $opponent")
      .getOrElse("Your season is complete")
  }

  private def lastOpponentIntentSpeech() = {
    GameService.myLastOpponent
      .map(opponent => s"You just played $opponent")
      .getOrElse("Your season hasn't started yet")
  }

  private def predictionIntentSpeech() = "With a 97.44 percent certainty I can say that the league champions will be " + TeamService.myTeamName

  /*
   * support methods
   */
  private def getTextResponse(intentName: String, speechText: String) = {
    val card = getSimpleCard(intentName, speechText)
    val speech = getPlainTextOutputSpeech(speechText)
    SpeechletResponse.newTellResponse(speech, card)
  }

  private def getAskResponse(cardTitle: String, speechText: String) = {
    val card = getSimpleCard(cardTitle, speechText)
    val speech = getPlainTextOutputSpeech(speechText)
    val reprompt = getReprompt(speech)
    SpeechletResponse.newAskResponse(speech, reprompt, card)
  }

  private def getSimpleCard(title: String, content: String) = {
    val card = new SimpleCard
    card.setTitle(title)
    card.setContent(content)
    card
  }

  private def getPlainTextOutputSpeech(speechText: String) = {
    val speech = new PlainTextOutputSpeech
    speech.setText(speechText)
    speech
  }

  private def getReprompt(outputSpeech: OutputSpeech) = {
    val reprompt = new Reprompt
    reprompt.setOutputSpeech(outputSpeech)
    reprompt
  }
}

object SoftballSpeechlet {
  private def logEvent(name: String, request: SpeechletRequest, session: Session): Unit = {
    println(s"$name requestId=$request.getRequestId sessionId=$session.getSessionId")
  }
}
