fun oddNumberUpTo(n: Int): List<Int> {
    val oddNumbers = mutableListOf<Int>() // Create a list to store odd numbers

    if (n >= 0) {
        for (i in 1..n) {
            if (i % 2 != 0) { // Check if the number is odd
                oddNumbers.add(i) // Add odd number to the list
            }
        }
    }
    return oddNumbers // Return the list of odd numbers
}

fun main() {

    println("Type a positive number: ")
    val input = readLine()?.toIntOrNull() // Read the input
    input?.let {
        val result = oddNumberUpTo(it) // Call the function with input
        println("Odd numbers up to $it: $result") // Print the result
    } ?: println("Invalid input!") // Handle null input case
}
