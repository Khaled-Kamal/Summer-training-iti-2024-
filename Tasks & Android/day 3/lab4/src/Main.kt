fun main() {
    println("Enter your name:")
    val input = readLine()
    val name: String? = input
    val finalName = name ?: "Guest"
    println("Final name: $finalName")
}
