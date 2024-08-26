import kotlinx.coroutines.*

fun main() = runBlocking {
    val job1 = launch {
        try {
            repeat(10) {
                println("Job 1: $it")
                delay(1000L)
            }
        } catch (e: CancellationException) {
            println("Job 1 cancelled")
        }
    }
    val job2 = launch {
        try {
            repeat(10) {
                println("Job 2: $it")
                delay(1000L)
            }
        } catch (e: CancellationException) {
            println("Job 2 cancelled")
        }
    }
    delay(10000L)
    job1.cancelAndJoin()
    job2.cancelAndJoin()
}
