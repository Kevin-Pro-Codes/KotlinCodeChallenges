// Function to concatenate two integer arrays
fun concat(array1: IntArray, array2: IntArray): IntArray {
    // Create a new array called 'result' to hold the concatenated values
    // The size of this array is the sum of the sizes of both input arrays
    val result = IntArray(array1.size + array2.size)

    // Copy elements from the first array (array1) into the result array
    // The 'indices' property gives a range of valid indices for array1
    for (i in array1.indices) {
        // Assign the value of array1 at index 'i' to the result at the same index
        result[i] = array1[i]
    }

    // Copy elements from the second array (array2) into the result array
    // This starts at the position immediately after the last element of array1
    for (i in array2.indices) {
        // Assign the value of array2 at index 'i' to the result array
        // We calculate the new position as 'array1.size + i' to place it correctly in the result
        result[array1.size + i] = array2[i]
    }

    // Return the concatenated array
    return result
}

// Main function to demonstrate the functionality of the concat function
fun main() {
    // Test case 1: Concatenating two integer arrays [1, 3, 5] and [2, 6, 8]
    // The result should be [1, 3, 5, 2, 6, 8]
    println(concat(intArrayOf(1, 3, 5), intArrayOf(2, 6, 8)).contentToString()) // Output: [1, 3, 5, 2, 6, 8]

    // Test case 2: Concatenating two integer arrays [7, 8] and [10, 9, 1, 1, 2]
    // The result should be [7, 8, 10, 9, 1, 1, 2]
    println(concat(intArrayOf(7, 8), intArrayOf(10, 9, 1, 1, 2)).contentToString()) // Output: [7, 8, 10, 9, 1, 1, 2]

    // Test case 3: Concatenating two integer arrays [4, 5, 1] and [3, 3, 3, 3, 3]
    // The result should be [4, 5, 1, 3, 3, 3, 3, 3]
    println(concat(intArrayOf(4, 5, 1), intArrayOf(3, 3, 3, 3, 3)).contentToString()) // Output: [4, 5, 1, 3, 3, 3, 3, 3]
}
