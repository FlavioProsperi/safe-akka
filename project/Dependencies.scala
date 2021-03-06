import sbt._

object Dependencies {

  object Akka {
    private val version = "2.5.6"

    val Actor = "com.typesafe.akka" %% "akka-actor" % version
    val Persistence = "com.typesafe.akka" %% "akka-persistence" % version
    val TestKit = "com.typesafe.akka" %% "akka-testkit" % version % Test
  }

  lazy val ScalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % Test
  lazy val PersistenceInmemory = "com.github.dnvriend" %% "akka-persistence-inmemory" % "2.5.1.1" % Test
}
