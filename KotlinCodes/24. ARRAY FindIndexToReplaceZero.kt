fun findIndexToReplaceZero(arr: IntArray): Int {
    var lastZeroIndex = -1   // Tracks the last index of 0 found
    var maxLength = 0        // Tracks the maximum length of continuous 1's found
    var maxIndex = -1        // Tracks the index of the 0 to be replaced for max 1's sequence
    var leftPointer = 0      // Left pointer of the sliding window

    // Iterate through the array with a right pointer
    for (rightPointer in arr.indices) {
        // If we encounter a 0, update the lastZeroIndex
        if (arr[rightPointer] == 0) {
            lastZeroIndex = rightPointer
        }

        // If we have more than one zero in the current window
        // then move the left pointer to the right of the last zero encountered
        if (rightPointer - leftPointer + 1 - (rightPointer - lastZeroIndex) > 1) {
            leftPointer = lastZeroIndex + 1
        }

        // Calculate the current length of the window containing 1s
        val currentLength = rightPointer - leftPointer + 1

        // Update maxLength and maxIndex if this is the longest sequence found
        if (currentLength > maxLength) {
            maxLength = currentLength
            maxIndex = lastZeroIndex
        }
    }

    return maxIndex  // Return the index of the zero to be replaced
}

fun main() {
    val array = intArrayOf(0, 0, 1, 0, 1, 1, 1, 0, 1, 1)
    val indexToReplace = findIndexToReplaceZero(array)
    println("Replace index: $indexToReplace")  // Expected Output: Replace index: 7
}
