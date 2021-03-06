name := "scala-consumes-client"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= {
  Seq(
    "com.typesafe.akka" % "akka-slf4j_2.11" % "2.4.0",
    "org.killbill" %% "killbill-api-client-scala" % "0.1"
  )
}