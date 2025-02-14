fun sumEvenNumbersUpTo(n: Int): Pair<IntArray, Int> {
    // Determine the size of the array (max even numbers up to n)
    val size = n / 2 // Maximum number of even numbers
    val evenNumbers = IntArray(size) // Initialize an IntArray of the determined size
    var index = 0 // Index to track the position in the array
    var sum = 0 // Mutable variable to accumulate the sum

    for (i in 1..n) {
        if (i % 2 == 0) { // Check if the number is even
            evenNumbers[index] = i // Assign the even number to the array
            sum += i // Accumulate the sum of even numbers
            index++ // Move to the next index
        }
    }

    // Return both the array of even numbers and the sum
    return Pair(evenNumbers, sum)
}

fun main() {
    println("Type a number: ")
    val n = readLine()?.toIntOrNull() // Read the input

    if (n != null) { // Check if n is not null
        val (evenNumbers, totalSum) = sumEvenNumbersUpTo(n) // Call the function and destructure results
        // Print the array of even numbers
        println("Even numbers up to $n: ${evenNumbers.joinToString(", ")}")
        // Print the sum of even numbers
        println("Sum of even numbers up to $n: $totalSum")
    } else {
        println("Invalid input! Please enter a valid number.") // Handle invalid input
    }
}
