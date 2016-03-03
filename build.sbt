lazy val root = (project in file(".")).enablePlugins(ZordonGenPlugin, AssemblyPlugin)

name := "scalacourse"

version := "1.0"

scalaVersion := "2.11.7"

zordonGenConfig := Seq(
  zordonGenConfig.value.head.copy(generateStubs = true)
)
