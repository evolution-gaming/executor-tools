
name := "executor-tools"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/executor-tools"))

startYear := Some(2017)

organizationName := "Evolution"

organizationHomepage := Some(url("http://evolution.com"))

publishTo := Some(Resolver.evolutionReleases)

scalaVersion := crossScalaVersions.value.last

crossScalaVersions := Seq("2.13.10", "2.12.17", "3.2.1")

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

scalacOptsFailOnWarn := Some(false)