fun printZeroSumSubarray(numbers: IntArray): Boolean {
    // A map to store the cumulative sum and its corresponding first occurrence index
    val sumIndexMap = mutableMapOf<Int, Int>()

    // Initialize the current sum to 0
    var currentSum = 0

    // Iterate through the numbers in the array
    for ((index, number) in numbers.withIndex()) {
        // Add the current number to the cumulative sum
        currentSum += number

        // Check if the current sum is zero
        // If zero, it means a subarray from the start to this index has a zero sum
        if (currentSum == 0) {
            println("Zero-sum subarray: ${numbers.copyOfRange(0, index + 1).contentToString()}")
            return true
        }

        // If current sum has been seen before, print the subarray starting from the next index
        // of its first occurrence of this sum to the current index
        if (sumIndexMap.containsKey(currentSum)) {
            val startIndex = sumIndexMap[currentSum]!! + 1
            println("Zero-sum subarray: ${numbers.copyOfRange(startIndex, index + 1).contentToString()}")
            return true
        }

        // Add the current sum to the map with its corresponding index
        // (if this sum hasn't been seen yet)
        sumIndexMap.putIfAbsent(currentSum, index)
    }

    // If no zero-sum subarray is found, return false
    return false
}

fun main() {
    val numbers = intArrayOf(3, 4, -7, 1, 3, 3, 1, -4)
    if (!printZeroSumSubarray(numbers)) {
        println("The array does not contain any subarray with zero sum.")
    }
}
