name := "softballSkill"
version := "0.5"
scalaVersion := "2.12.4"

lazy val dependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "com.amazon.alexa" % "alexa-skills-kit" % "1.8.1",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.7.5",
  "org.apache.logging.log4j" % "log4j-core" % "2.6.2",
  "org.slf4j" % "slf4j-api" % "1.7.21",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "commons-io" % "commons-io" % "2.5"
//  "com.amazonaws" % "aws-lambda-java-core" % "1.2.0", // was 1.1.0, latest 1.2.0
//  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.11.253" // was 1.11.31, latest 1.11.253
)

libraryDependencies ++= dependencies

// for linting during compile
wartremoverErrors in (Compile, compile) ++= Warts.unsafe
