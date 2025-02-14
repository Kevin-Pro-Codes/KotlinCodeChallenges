fun factorial(n: Int): Long {
    require(n >= 0) { "The input must be a non-negative integer." }

    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    println("Enter a positive integer to calculate its factorial:")
    val input = readLine()

    if (input != null && input.all { it.isDigit() }) {
        val n = input.toInt()
        if (n >= 0) {
            println("The factorial of $n is: ${factorial(n)}")
        } else {
            println("Please enter a non-negative integer.")
        }
    } else {
        println("Please enter a valid integer.")
    }
}
