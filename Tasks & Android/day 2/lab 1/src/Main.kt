fun main() {
    print("Enter temperature in Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        val fahrenheit = (celsius * 9/5) + 32
        println("Temperature in Fahrenheit: $fahrenheit")
    } else {
        println("Invalid input. Please enter a numeric value.")
    }
}
