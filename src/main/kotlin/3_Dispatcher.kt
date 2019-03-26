@file:Suppress("PackageDirectoryMismatch")

package example5

import kotlinx.coroutines.*

fun main(arg: Array<String>) {

  println("Task One ${Thread.currentThread().name}")

  runBlocking(Dispatchers.IO) {
    longRunningTask("Task Two")
  }

  println("Task Three ${Thread.currentThread().name}")

}

suspend fun longRunningTask(value: String) {
  delay(1000) // One Second
  println("$value  ${Thread.currentThread().name}")
}







