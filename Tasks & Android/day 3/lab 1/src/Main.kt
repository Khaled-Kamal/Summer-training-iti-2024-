fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun main() {
    greet("Alice")
    greet()
}
