name := "executor-tools"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/executor-tools"))

startYear := Some(2017)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := crossScalaVersions.value.last

crossScalaVersions := Seq("2.12.9", "2.13.0")

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))

releaseCrossBuild := true