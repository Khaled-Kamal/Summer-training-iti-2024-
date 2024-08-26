import kotlinx.coroutines.*

suspend fun factorial(n: Int): Int = withContext(Dispatchers.Default) {
    (1..n).fold(1) { acc, i -> acc * i }
}

fun main() = runBlocking {
    val result = async { factorial(5) }
    println(result.await())
}
