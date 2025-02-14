import kotlin.random.Random  // Import the Random class for generating random numbers

// Function to shuffle an array using the Fisher-Yates algorithm
fun fisherYatesShuffle(arr: IntArray) {
    // Get the length of the array
    val n = arr.size

    // Iterate from the last element down to the second element
    for (i in n - 1 downTo 1) { // downTo creates a decreasing range
        // Generate a random integer j such that 0 <= j <= i
        val j = Random.nextInt(0, i + 1) // Random index in the range [0, i]

        // Swap arr[i] with arr[j]
        val temp = arr[i]  // Store the current element in a temporary variable
        arr[i] = arr[j]    // Assign the element at arr[j] to arr[i]
        arr[j] = temp      // Assign the value stored in temp (original arr[i]) to arr[j]
    }
}

// Main function to demonstrate the shuffling
fun main() {
    // Example array to be shuffled
    val array = intArrayOf(1, 2, 3, 4, 5)

    // Print the original array before shuffling
    println("Original array: ${array.joinToString(", ")}")

    // Call the shuffle function to randomize the elements in the array
    fisherYatesShuffle(array)

    // Print the shuffled array to show the result
    println("Shuffled array: ${array.joinToString(", ")}")
}
