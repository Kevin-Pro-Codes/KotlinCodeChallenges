fun maxLengthSubarrayWithSum(nums: IntArray, target: Int): IntArray? {
    // Create a map to store cumulative sums and their indices.
    // The key is the cumulative sum, and the value is the index where that sum was first encountered.
    // This map allows us to efficiently check for subarrays with the target sum.
    val sumIndexMap = mutableMapOf<Int, Int>()

    // Initialize variables to track the longest subarray found.
    var currentSum = 0        // Running sum of elements.
    var maxLen = 0            // Length of the longest subarray found so far.
    var startIndex = -1       // Starting index of the longest subarray found so far (-1 indicates no subarray found).

    // Iterate through the input array.
    for (i in nums.indices) {
        // Add the current element to the running sum.
        currentSum += nums[i]

        // Check if the current sum equals the target. If it does, we've found a subarray starting at index 0.
        if (currentSum == target) {
            // Check if this subarray is longer than any previously found subarray.
            if (i + 1 > maxLen) {
                maxLen = i + 1       // Update the maximum length.
                startIndex = 0       // The subarray starts at index 0.
            }
        }

        // Check if a subarray with the target sum exists within the current cumulative sum.
        // We do this by checking if (currentSum - target) exists in the map.  If it does, it means there's a subarray between the index stored in the map and the current index.
        if (sumIndexMap.containsKey(currentSum - target)) {
            val previousIndex = sumIndexMap[currentSum - target]!! // Get the index of the previous cumulative sum (safe because we checked with containsKey).
            val length = i - previousIndex // Calculate the length of this subarray.
            // Check if this subarray is longer than any previously found subarray.
            if (length > maxLen) {
                maxLen = length            // Update the maximum length.
                startIndex = previousIndex + 1 // Update the starting index of the longest subarray.
            }
        }

        // Add the current cumulative sum and its index to the map, but only if it's not already present.
        // This ensures we keep track of the first occurrence of each cumulative sum, which is essential for finding the longest subarray.
        if (!sumIndexMap.containsKey(currentSum)) {
            sumIndexMap[currentSum] = i
        }
    }

    // Return the longest subarray if one was found; otherwise, return null.
    return if (startIndex != -1) {
        nums.copyOfRange(startIndex, startIndex + maxLen) // Create a copy of the longest subarray.
    } else {
        null  // No subarray with the target sum was found.
    }
}

fun main() {
    // Example usage:
    val nums = intArrayOf(5, 6, -5, 5, 3, 5, 3, -2, 0)
    val target = 15
    val result = maxLengthSubarrayWithSum(nums, target)

    // Print the result.
    if (result != null) {
        println("The longest subarray with sum $target is: ${result.joinToString(", ")}")
    } else {
        println("No subarray with sum $target found.")
    }
}
