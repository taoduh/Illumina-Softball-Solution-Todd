# Illumina Softball Skill

A quick tour

### com.toddnewman.alexa.softballskill

*SoftballSpeechlet* is the Alexa skill implementaion.  Not much to look at here, we're not doing anything complex Alexa-wise.

*SoftballSpeechletRequestStreamHandler* is Alexa boilerplate (in Java for now).  

### com.toddnewman.alexa.softballskill.data

This package contains types (Schema.scala) and hard-coded data in lieu of a database.

### com.toddnewman.alexa.softballskill.app

The app folder is where the action is.  Here there are methods to slice and dice the data for Alexa's pleasure.

My goal was to demonstrate concise anonymous functions and other scala fun.


### Potential improvements
- Improve the data model to better match the game (e.g. game and inning-specific batting orders)
- More data (at-bats, fielding?), perhaps filled with random values via [a fake data tool](https://github.com/justwrote/scala-faker)
- Basic stats from the above (e.g. RBIs, slugging)
- Fun with advanced statistic (which players are the most valuable)
- A conversational skill that maintains state
- Convert SoftballSpeechletRequestStreamHandler to scala
