package com.evolutiongaming.concurrent

import scala.concurrent.ExecutionContextExecutor

object CurrentThreadExecutionContext extends ExecutionContextExecutor {
  def execute(runnable: Runnable) = runnable.run()
  def reportFailure(cause: Throwable) = throw cause
}