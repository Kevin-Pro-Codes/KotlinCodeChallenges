// Function to find a pair of numbers in an array that adds up to a given sum
fun findPairWithSum(numbers: IntArray, targetSum: Int): Pair<Int, Int>? {
    // A set to store the numbers as we iterate, enabling quick lookup for complements
    val seenNumbers = mutableSetOf<Int>()

    // Iterate over each number in the input array
    for (number in numbers) {
        // Calculate the complement that when added to the current number results in the targetSum
        val complement = targetSum - number

        // Check if this complement exists in the set of seen numbers
        if (complement in seenNumbers) {
            // If the complement is found, return the pair (complement, number)
            return Pair(complement, number)
        }

        // Add the current number to the set for future complement checks
        seenNumbers.add(number)
    }

    // Return null if no valid pair is found in the entire array
    return null
}

// Main function to demonstrate the usage of findPairWithSum
fun main() {
    // Declare an array of numbers to search within
    val numbers = intArrayOf(2, 7, 11, 15)

    // Define the target sum to find within the array as a pair
    val targetSum = 9

    // Call the findPairWithSum function with the array and the target sum
    val result = findPairWithSum(numbers, targetSum)

    // Check if a result was found and print the appropriate message
    result?.let {
        // Print the pair found
        println("Pair found: (${it.first}, ${it.second})")  // Expected output: Pair found: (2, 7)
    } ?: println("No pair found with the sum $targetSum.") // Print message if no pair was found
}
