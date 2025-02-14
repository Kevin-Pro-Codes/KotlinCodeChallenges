fun evenNumbersUpTo(n: Int): IntArray {
    // Determine the size of the array
    val size = n / 2 // Maximum number of even numbers
    val evenNumbers = IntArray(size) // Initialize an IntArray of the determined size
    var index = 0 // Index to track the position in the array

    for (i in 1..n) {
        if (i % 2 == 0) { // Check if the number is even
            evenNumbers[index] = i // Assign the even number to the array
            index++ // Move to the next index
        }
    }
    return evenNumbers // Return the array of even numbers
}

fun main() {
    println("Type a number: ")
    val n = readLine()?.toIntOrNull()

    if (n != null) { // Check if n is not null
        val evenNumbers = evenNumbersUpTo(n) // Call the function to get the even numbers
        println("Even numbers up to $n: ${evenNumbers.joinToString(", ")}") // Print the array
    } else {
        println("Invalid input! Please enter a valid number.") // Handle invalid input
    }
}
