fun maxProduct(arr: IntArray): Pair<Int, Int> {
    // Check if the array has at least two elements
    if (arr.size < 2) {
        throw IllegalArgumentException("Array must contain at least two integers.")
    }

    // Initialize the two largest and two smallest integers and their pairs
    var max1 = Int.MIN_VALUE // The largest number
    var max2 = Int.MIN_VALUE // The second largest number
    var min1 = Int.MAX_VALUE  // The smallest number
    var min2 = Int.MAX_VALUE  // The second smallest number

    var maxPair: Pair<Int, Int> = Pair(0, 0)
    var minPair: Pair<Int, Int> = Pair(0, 0)

    // Traverse the array to find the top two maximums and minimums
    for (num in arr) {
        // Update maximums
        if (num > max1) {
            max2 = max1
            max1 = num
            maxPair = Pair(num, max2) // Update pair
        } else if (num > max2) {
            max2 = num
            maxPair = Pair(max1, num) // Update pair
        }

        // Update minimums
        if (num < min1) {
            min2 = min1
            min1 = num
            minPair = Pair(num, min2) // Update pair
        } else if (num < min2) {
            min2 = num
            minPair = Pair(min1, num) // Update pair
        }
    }

    // Calculate the maximum product of two largest and two smallest
    val maxProductPositive = max1 * max2
    val maxProductNegative = min1 * min2

    return if (maxProductPositive >= maxProductNegative) {
        maxPair // Return the pair of largest numbers
    } else {
        minPair // Return the pair of smallest numbers
    }
}

fun main() {
    val array = intArrayOf(-10, -3, 4, 6, -2)
    val maxProductPair = maxProduct(array)
    println("Maximum product pair: (${maxProductPair.first}, ${maxProductPair.second})")  // Expected Output: Maximum product pair: (5, 6)
}
