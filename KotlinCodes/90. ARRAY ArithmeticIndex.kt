// Function to get the value at a specified index from an array
fun valueAt(array: IntArray, index: Double): Int {

    // Convert the index from Double to Int
    // The toInt() method truncates the decimal part of the index,
    // effectively rounding down to the nearest whole number.
    val validIndex = index.toInt() // Example: if index is 5.9, validIndex becomes 5

    // Check if the calculated index is a valid index for the array
    // 'array.indices' gives us a range of valid indices for the given array.
    // For instance, if array has 6 elements, valid indices are 0 to 5.
    return if (validIndex in array.indices) {
        // If validIndex is within bounds, return the element at that index in the array
        array[validIndex] // Return the value at the valid index from the array
    } else {
        // If validIndex is not a valid index (out of bounds), throw an exception
        throw IndexOutOfBoundsException("Index $validIndex is out of bounds for array of size ${array.size}.")
    }
}

// Test cases
fun main() {
    // Testing the function with an array and a calculated index
    // The value should be at index 5 (10.0 / 2 = 5)
    println(valueAt(intArrayOf(1, 2, 3, 4, 5, 6), 10.0 / 2)) // Output: 6

    // Testing with another index (8.0 / 2 = 4)
    // The value should be at index 4
    println(valueAt(intArrayOf(1, 2, 3, 4, 5, 6), 8.0 / 2)) // Output: 5

    // Testing with a decimal index (6.535355314 / 2 = 3.267677657)
    // The valid index will be 3 (after truncation)
    println(valueAt(intArrayOf(1, 2, 3, 4), 6.535355314 / 2)) // Output: 4
}
