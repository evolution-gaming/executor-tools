package com.evolutiongaming.concurrent

import scala.concurrent.{ExecutionContext, ExecutionContextExecutorService}

object ExecutorHelper {

  implicit class ExecutionContextOps(val self: ExecutionContext) extends AnyVal {

    def toExecutorService: ExecutionContextExecutorService = {
      ExecutionContextExecutorServiceFactory(self)
    }
  }
}
