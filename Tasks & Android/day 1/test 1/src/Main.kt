fun main() {
    while (true) {
        println("Enter first number:")
        val num1 = readLine()!!.toDouble()

        println("Enter second number:")
        val num2 = readLine()!!.toDouble()

        println("Choose operation: ADD, SUB, MUL, DIV")
        val operation = readLine()

        val result = when (operation!!.uppercase()) {
            "ADD" -> add(num1, num2)
            "SUB" -> sub(num1, num2)
            "MUL" -> mul(num1, num2)
            "DIV" -> div(num1, num2)
            else -> {
                println("Invalid operation")
                continue
            }
        }

        println("Result: $result")
        println("Do you want to perform another calculation? (yes/no)")
        val continueCalc = readLine()!!
        if (continueCalc.lowercase() != "yes") {
            break
        }
    }
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun sub(a: Double, b: Double): Double {
    return a - b
}

fun mul(a: Double, b: Double): Double {
    return a * b
}

fun div(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Error: Division by zero")
        return Double.NaN
    }
    return a / b
}
