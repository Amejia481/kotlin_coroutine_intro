@file:Suppress("PackageDirectoryMismatch")

package example2

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//Synchronous Code
fun main(arg: Array<String>) {
  println("Task One")

  //Blocking Code
  runBlocking {
    longRunningTask("Task Two")
  }

  println("Task Three")
}

suspend fun longRunningTask(value: String) {
  delay(1000) // One Second
  println(value)
}






