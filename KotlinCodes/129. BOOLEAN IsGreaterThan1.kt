fun isGreater(n1: Int, n2: Int): Boolean {
    // You can compute the division result directly instead of declaring an unused variable
    if (n1 / n2 > 1) {
        println("The result is superior than 1")
        return true
    } else {
        println("The result is inferior than 1")
        return false
    }
}

fun main() {
    isGreater(22, 11)
}
