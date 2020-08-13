package com.evolutiongaming.concurrent

import scala.concurrent.ExecutionContextExecutor

case object CurrentThreadExecutionContext extends ExecutionContextExecutor {
  def execute(runnable: Runnable): Unit = runnable.run()
  def reportFailure(cause: Throwable): Unit = throw cause
}
