fun mergeAndSortArrays(X: IntArray, Y: IntArray) {
    // Determine the sizes of the arrays X and Y
    val m = X.size
    val n = Y.size

    // Initialize the gap to half the combined size of both arrays
    // The gap will determine how far apart comparisons are made
    var gap = (m + n) / 2

    // Continue the process until the gap becomes zero
    while (gap > 0) {
        var i = 0
        // Compare elements in X[] with the specified gap
        while (i + gap < m) {
            if (X[i] > X[i + gap]) {
                // Swap elements in X[] if they are in the wrong order
                val temp = X[i]
                X[i] = X[i + gap]
                X[i + gap] = temp
            }
            // Move the pointer to the next element
            i++
        }

        // Initialize j to be used for comparing between X[] and Y[]
        // Set j to start either from the beginning of Y[] or the overflow from X[] range
        var j = if (i + gap - m < 0) 0 else i + gap - m

        // Compare elements between the remaining parts of X[] and the start of Y[]
        while (i < m && j < n) {
            if (X[i] > Y[j]) {
                // Swap elements between X[] and Y[] if they are in the wrong order
                val temp = X[i]
                X[i] = Y[j]
                Y[j] = temp
            }
            // Move the pointers to the next position in both arrays
            i++
            j++
        }

        // Compare remaining elements in Y[] with the specified gap
        if (j < n) {
            var k = 0
            while (j + k + gap < n) {
                if (Y[j + k] > Y[j + k + gap]) {
                    // Swap elements in Y[] if they are in the wrong order
                    val temp = Y[j + k]
                    Y[j + k] = Y[j + k + gap]
                    Y[j + k + gap] = temp
                }
                // Move the pointer to the next element
                k++
            }
        }

        // Calculate the next gap value
        // This reduces the gap gradually towards zero, following the shell sort logic
        gap = if (gap == 1) 0 else (gap / 2 + gap % 2)
    }
}

fun main() {
    // Example usage with input arrays X and Y
    val X = intArrayOf(1, 4, 7, 8, 10)
    val Y = intArrayOf(2, 3, 9)

    // Call the function to merge and sort the elements of X and Y
    mergeAndSortArrays(X, Y)

    // Print the result, showing the first m smallest elements in X and the remainder in Y
    println("X: ${X.joinToString(", ")}")  // Expected Output: X: 1, 2, 3, 4, 7
    println("Y: ${Y.joinToString(", ")}")  // Expected Output: Y: 8, 9, 10
}
