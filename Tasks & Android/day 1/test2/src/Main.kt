fun main() {
    print("Enter your first name: ")
    val firstName = readLine()


    print("Enter your last name: ")
    val lastName = readLine()

    if (firstName != null && lastName != null) {
        println("Your full name is: $firstName $lastName")
    } else {
        println("Invalid input")
    }
}
