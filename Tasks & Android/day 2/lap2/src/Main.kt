fun main() {
    var n = 1

    while (n <= 20) {
        if (n == 15) {
            break
        }
        if (n % 4 == 0) {
            n++
            continue
        }
        println(n)
        n++
    }
}
