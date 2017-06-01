# executor-tools [![Build Status](https://travis-ci.org/evolution-gaming/executor-tools.svg)](https://travis-ci.org/evolution-gaming/executor-tools) [ ![version](https://api.bintray.com/packages/evolutiongaming/maven/executor-tools/images/download.svg) ](https://bintray.com/evolutiongaming/maven/executor-tools/_latestVersion)

This micro dependency-free library contains a couple of simple classes we've annoyed to create in every project.
Akka has own, Play has own, other libraries has own of these...

### CurrentThreadExecutionContext.scala

To execute `Future.map`, `Future.flatMap` on the same thread


### ExecutionContextExecutorServiceFactory.scala

To get `ExecutionContextExecutorService` out of `ExecutionContext`  


## Setup

```scala
resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

libraryDependencies += "com.evolutiongaming" %% "executor-tools" % "1.0.0"
```