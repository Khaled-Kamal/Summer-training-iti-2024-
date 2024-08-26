import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter temperature in Celsius: ")
    val celsius = scanner.nextDouble()

    val fahrenheit = (celsius * 9/5) + 32

    println("Temperature in Fahrenheit: $fahrenheit")
}
