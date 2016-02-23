logLevel := Level.Warn

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Synergy-GB Snapshots" at "https://nexus.synergy-gb.com/nexus/content/repositories/snapshots/"
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.synergygb.zordon" % "zordon-gen" % "1.0.0-SNAPSHOT")

addSbtPlugin("com.synergygb.zordon" % "zordon-assembly" % "1.0.0-SNAPSHOT")