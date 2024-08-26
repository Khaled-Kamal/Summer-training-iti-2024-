import kotlinx.coroutines.*

suspend fun sumArray(arr: IntArray): Int = withContext(Dispatchers.Default) {
    arr.sum()
}

fun main() = runBlocking {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val result = async { sumArray(array) }
    println(result.await())
}
