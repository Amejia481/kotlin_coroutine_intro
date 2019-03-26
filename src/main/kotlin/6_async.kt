@file:Suppress("PackageDirectoryMismatch")

package example5

import kotlinx.coroutines.*

fun main(arg: Array<String>) = runBlocking {
  val startTime = System.currentTimeMillis()

  val deferredValue1 = async { fetchUser(1) }
  val deferredValue2 = async { fetchUser(2) }
  val deferredValue3 = async { fetchUser(3) }

  println(deferredValue1.await() + deferredValue2.await() + deferredValue3.await())

  val endTime = System.currentTimeMillis()

  println("Time taken: ${endTime - startTime}")
}

suspend fun fetchUser(id: Int): String {
  delay(1000) // One Second
  return "UserName$id "
}







