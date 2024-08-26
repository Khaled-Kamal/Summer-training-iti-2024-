import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        for (i in 1..10) {
            println(i)
            delay(1000L)
        }
    }
    job.join()
}
