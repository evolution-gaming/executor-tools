# executor-tools
[![Build Status](https://github.com/evolution-gaming/executor-tools/workflows/CI/badge.svg)](https://github.com/evolution-gaming/executor-tools/actions?query=workflow%3ACI)
[![Coverage Status](https://coveralls.io/repos/evolution-gaming/executor-tools/badge.svg)](https://coveralls.io/r/evolution-gaming/executor-tools)
[![Version](https://img.shields.io/badge/version-click-blue)](https://evolution.jfrog.io/artifactory/api/search/latestVersion?g=com.evolutiongaming&a=executor-tools-actor_2.13&repos=public)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

This micro dependency-free library contains a couple of simple classes we've annoyed to create in every project.
Akka has own, Play has own, other libraries has own of these...

### CurrentThreadExecutionContext.scala

To execute `Future.map`, `Future.flatMap` on the same thread


### ExecutionContextExecutorServiceFactory.scala

To get `ExecutionContextExecutorService` out of `ExecutionContext`  


## Setup

```scala
addSbtPlugin("com.evolution" % "sbt-artifactory-plugin" % "0.0.2")

libraryDependencies += "com.evolutiongaming" %% "executor-tools" % "1.0.3"
```