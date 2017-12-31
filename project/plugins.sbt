// TTN: changed from 0.4.2 so that d/l was successful
// now probably obsolete entirely due to removing plugin from build.sbt
// do I need something here to run sbt assembly (as it seems)?
// can I include a real dependency instead?
addSbtPlugin("com.gilt.sbt" % "sbt-aws-lambda" % "0.5.0")
