@file:Suppress("PackageDirectoryMismatch")

package example6

import kotlinx.coroutines.*

fun main(arg: Array<String>) {

  //Let's learn about parenthood
  val scope = CoroutineScope(Dispatchers.IO)

  runBlocking {
    println("Task One")
    val job = scope.launch {
      longRunningTask("Task Two")
    }

    println("Task Three ")
    job.join()
  }
}

suspend fun longRunningTask(value: String) {
  delay(3000) // One Second
  println("$value ")
}







