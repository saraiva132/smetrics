import sbt._

object Dependencies {

  val prometheus    = "io.prometheus"        % "simpleclient" % "0.6.0"
  val scalatest     = "org.scalatest"       %% "scalatest"    % "3.0.8"
  val `cats-helper` = "com.evolutiongaming" %% "cats-helper"  % "0.0.29"

  object Cats {
    private val version = "1.6.1"
    val core   = "org.typelevel" %% "cats-core"   % version
    val effect = "org.typelevel" %% "cats-effect" % "1.4.0"
  }
}
