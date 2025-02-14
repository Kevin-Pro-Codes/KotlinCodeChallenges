// Function to sort a binary array containing only 0s and 1s
fun sortBinaryArray(arr: IntArray) {
    // Variable to keep track of the number of zeros in the array
    var zeroCount = 0

    // Traverse the array to count the number of zeros
    for (num in arr) {
        if (num == 0) {
            zeroCount++ // Increment the zero counter for each zero found
        }
    }

    // Fill the array with zeros up to the zeroCount index
    for (i in 0 until zeroCount) {
        arr[i] = 0 // Set each element to 0
    }

    // Fill the remaining positions in the array with ones
    for (i in zeroCount until arr.size) {
        arr[i] = 1 // Set each element to 1, after all zeros are placed
    }
}

// Main function to test the sortBinaryArray function
fun main() {
    // Define a sample binary array with mixed 0s and 1s
    val binaryArray = intArrayOf(0, 1, 0, 1, 0, 0, 1, 1, 0)

    // Call the sorting function to sort the binary array
    sortBinaryArray(binaryArray)

    // Print the sorted binary array in the format: 0, 0, 0, 0, 1, 1, 1, 1, 1
    println("Sorted binary array: ${binaryArray.joinToString(", ")}")
}
