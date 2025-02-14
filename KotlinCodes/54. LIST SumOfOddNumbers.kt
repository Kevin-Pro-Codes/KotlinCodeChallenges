fun oddNumberUpTo2(n: Int) {
    val oddNumbers = mutableListOf<Int>() // List to store odd numbers
    var sum = 0 // Variable to store the sum of odd numbers

    if (n >= 0) {
        for (i in 1..n) {
            if (i % 2 != 0) { // Check if the number is odd
                oddNumbers.add(i) // Add odd number to the list
                sum += i // Add the odd number to the sum
            }
        }
    }

    // Print the results directly in the function
    println("Odd numbers up to $n: $oddNumbers") // Print the list of odd numbers
    println("Sum of odd numbers: $sum") // Print the sum
}

fun main() {
    println("Type a positive number: ")
    val input = readLine()?.toIntOrNull() // Read the input

    input?.let {
        oddNumberUpTo2(it) // Call the function with input
    } ?: println("Invalid input!") // Handle null input case
}
