import kotlin.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(5) {
            println("Working: $it")
            delay(500L)
        }
    }
    job.join()
    println("Job completed")

    val job2 = launch {
        repeat(5) {
            println("Working: $it")
            delay(500L)
        }
    }
    delay(2000L)
    job2.cancelAndJoin()
    println("Job cancelled")
}
