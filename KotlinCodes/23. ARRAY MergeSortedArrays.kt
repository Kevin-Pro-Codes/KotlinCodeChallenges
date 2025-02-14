fun mergeSortedArrays(X: IntArray, Y: IntArray) {
    val m = X.size
    val n = Y.size

    // Indices for the last elements in X and Y arrays
    var xIndex = m - n - 1  // Last element index of the non-empty part of X[]
    var yIndex = n - 1      // Last element index of Y[]
    var mergeIndex = m - 1  // Last index of X[], where merged elements will be placed

    // Iterate backwards through both arrays
    while (xIndex >= 0 && yIndex >= 0) {
        if (X[xIndex] > Y[yIndex]) {
            // Place the larger element at the current merge position
            X[mergeIndex] = X[xIndex]
            xIndex--
        } else {
            // Place the larger element from Y at the current merge position
            X[mergeIndex] = Y[yIndex]
            yIndex--
        }
        // Move the merge index backwards
        mergeIndex--
    }

    // If there are leftover elements in Y[], place them in X[]
    while (yIndex >= 0) {
        X[mergeIndex] = Y[yIndex]
        yIndex--
        mergeIndex--
    }

    // No need to handle remaining X[] elements as they are already in place
}

fun main() {
    // Initialize array X with sufficient space and array Y
    val X = intArrayOf(1, 3, 5, 0, 0, 0)  // 3 empty slots for elements of Y[]
    val Y = intArrayOf(2, 4, 6)

    // Merge Y into X maintaining sorted order
    mergeSortedArrays(X, Y)

    // Output the merged sorted array
    println("Merged array: ${X.joinToString(", ")}")  // Expected Output: Merged array: 1, 2, 3, 4, 5, 6
}
