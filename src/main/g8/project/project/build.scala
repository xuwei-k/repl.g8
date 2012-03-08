import sbt._

object Plugins extends Build {
  lazy val root = Project("root", file(".")) dependsOn(
    uri("git://github.com/xuwei-k/repl.git#$replPluginBranch$" )
  )
}

