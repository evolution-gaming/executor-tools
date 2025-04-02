package com.evolutiongaming.concurrent

import scala.concurrent.{ExecutionContext, ExecutionContextExecutor}

case object CurrentThreadExecutionContext extends ExecutionContextExecutor {
  private val ec = ExecutionContext.parasitic

  def execute(runnable: Runnable): Unit = ec.execute(runnable)
  def reportFailure(cause: Throwable): Unit = ec.reportFailure(cause)
}
