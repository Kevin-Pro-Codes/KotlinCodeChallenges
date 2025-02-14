fun moveZerosToEnd(arr: IntArray) {
    // Pointer `lastNonZeroFoundAt` marks the index where the next non-zero element
    // should be placed as we iterate through the array
    var lastNonZeroFoundAt = 0

    // Loop through each element in the array
    for (i in arr.indices) {
        // When the current element is non-zero, swap it with the element
        // at `lastNonZeroFoundAt`
        if (arr[i] != 0) {
            // Swap the current element with the last non-zero element found
            val temp = arr[i]
            arr[i] = arr[lastNonZeroFoundAt]
            arr[lastNonZeroFoundAt] = temp

            // Increment `lastNonZeroFoundAt` to the next position
            lastNonZeroFoundAt++
        }
    }
}

fun main() {
    // Initialize an example array with integers and zeros
    val array = intArrayOf(6, 0, 8, 2, 3, 0, 4, 0, 1)

    // Call the function to move all zeros to the end of the array
    moveZerosToEnd(array)

    // Print the modified array where all zeros are moved to the end
    println("Array after moving zeros to the end: ${array.joinToString(", ")}")  // Expected Output: 6, 8, 2, 3, 4, 1, 0, 0, 0
}
