@file:Suppress("PackageDirectoryMismatch")

package example4

import kotlinx.coroutines.*

fun main(arg: Array<String>) = runBlocking {

  println("Task One ${Thread.currentThread().name}")

 launch(Dispatchers.IO) {
   longRunningTask("Task Two")
 }

  println("Task Three ${Thread.currentThread().name}")

}

suspend fun longRunningTask(value: String) {
  delay(3000) // One Second
  println("$value  ${Thread.currentThread().name}")
}







