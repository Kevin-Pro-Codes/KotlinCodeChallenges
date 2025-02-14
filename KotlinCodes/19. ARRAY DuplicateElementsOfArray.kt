// Function to find the duplicate element in an array where elements are between 1 and n-1
// The function operates in-place without using extra space
fun findDuplicate(nums: IntArray): Int {
    // Loop through each element in the array using indices
    for (i in nums.indices) {
        // Use the absolute value of the current element to get the index
        // This is necessary because elements might have been negated already
        val index = kotlin.math.abs(nums[i])

        // Check if the element at this computed index is negative
        // If negative, it means this index has been visited, indicating a duplicate
        if (nums[index] < 0) {
            // Return the current index value as this is the duplicate element
            return index
        } else {
            // Negate the element at this index to mark it as visited
            // This marks that the index corresponding to the current element's value
            // has been visited before
            nums[index] = -nums[index]
        }
    }
    // If no duplicate is found, which shouldn't occur as per problem statement constraints,
    // return -1. This is a fallback scenario.
    return -1
}

fun main() {
    // Define an integer array containing a duplicate element
    val nums = intArrayOf(1, 3, 4, 2, 2)

    // Invoke the findDuplicate function to find the duplicate element
    val duplicate = findDuplicate(nums)

    // Print the duplicate element found in the array
    // Expected output is 2 since 2 is the repeated element in the array
    println("The duplicate number is: $duplicate")
}
