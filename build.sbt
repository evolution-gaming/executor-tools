name := "executor-tools"

organization := "com.evolutiongaming"

homepage := Some(url("https://github.com/evolution-gaming/executor-tools"))

startYear := Some(2017)

organizationName := "Evolution"

organizationHomepage := Some(url("https://evolution.com"))

publishTo := Some(Resolver.evolutionReleases)

versionPolicyIntention := Compatibility.BinaryCompatible

scalaVersion := crossScalaVersions.value.last

crossScalaVersions := Seq("2.13.16", "2.12.20", "3.3.5")

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

addCommandAlias("fmt", "all scalafmtAll scalafmtSbt")
addCommandAlias("check", "all scalafmtCheckAll scalafmtSbtCheck; +all versionPolicyCheck Compile/doc")
addCommandAlias("build", "+all compile test")
