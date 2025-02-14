fun squareOfNumber(n: Int): Int {
    return n * n // Calculate the square of the number and return it
}

fun main() {
    println("Type a number: ")
    val input = readLine()?.toIntOrNull() // Read and convert input to Int

    if (input != null) { // Check if the input is valid
        val result = squareOfNumber(input) // Call the function with the input
        println("The square of $input is: $result") // Print the result
    } else {
        println("Invalid input! Please enter a valid number.") // Handle invalid input
    }
}
