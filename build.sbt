name := "scalacourse"

version := "1.0"

scalaVersion := "2.11.7"

val sprayVersion = "1.3.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka"  %% "akka-actor"       % "2.3.9",
  "io.spray"           %% "spray-can"        % sprayVersion,
  "io.spray"           %% "spray-routing"    % sprayVersion,
  "io.spray"           %% "spray-json"       % "1.3.2",
  "org.scalatest"      %% "scalatest"        % "2.2.4"
)