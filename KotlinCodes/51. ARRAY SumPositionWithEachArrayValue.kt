fun addIndexes(arr: IntArray): IntArray {
    // Create a new array to hold the results
    val result = IntArray(arr.size)

    // Loop through each element of the input array using its indices
    for (index in arr.indices) {
        // Add the index to the element and store it in the result array
        result[index] = arr[index] + index
    }

    return result // Return the new array with added indexes
}

fun main() {
    // Call the function with different examples and print the output
    println(addIndexes(intArrayOf(6, 3, 2, 8, 1)).contentToString()) // Output: [6, 4, 4, 11, 5]
    println(addIndexes(intArrayOf(1, 2, 3, 4, 5)).contentToString()) // Output: [1, 3, 5, 7, 9]
    println(addIndexes(intArrayOf(5, 4, 3, 2, 1)).contentToString()) // Output: [5, 5, 5, 5, 5]
}
