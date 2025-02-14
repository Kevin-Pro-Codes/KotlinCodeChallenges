fun printNumbersDownToZero(n: Int) {
    var sumOfSquares = 0 // Initialize a variable to hold the sum of squares

    for (i in n downTo 0) {
        val square = i * i // Calculate the square of the current number
        sumOfSquares = sumOfSquares + square // Add the square to the cumulative sum
        println(square) // Print the square of the current number
    }

    // Print the total sum of squares after the loop
    println("Sum of squares from $n down to 0: $sumOfSquares")
}

fun main() {
    // Example usage
    println("Enter a number:")
    val n = readLine()!!.toInt() // Read user input and convert to Int
    printNumbersDownToZero(n) // Call the function with user input
}
