fun addIndexes(numbers: List<Int>): List<Int> {
    // Use `mapIndexed` to iterate through the list and add the index to the corresponding number
    return numbers.mapIndexed { index, number -> number + index }
}

fun main() {
    // Example 1: Adding the index to the number at each position
    // Input: [0, 0, 0, 0, 0]
    // Output: [0 + 0, 0 + 1, 0 + 2, 0 + 3, 0 + 4] -> [0, 1, 2, 3, 4]
    println(addIndexes(listOf(0, 0, 0, 0, 0))) // ➞ [0, 1, 2, 3, 4]

    // Example 2: Adding the index to the number at each position
    // Input: [1, 2, 3, 4, 5]
    // Output: [1 + 0, 2 + 1, 3 + 2, 4 + 3, 5 + 4] -> [1, 3, 5, 7, 9]
    println(addIndexes(listOf(1, 2, 3, 4, 5))) // ➞ [1, 3, 5, 7, 9]

    // Example 3: Adding the index to the number at each position
    // Input: [5, 4, 3, 2, 1]
    // Output: [5 + 0, 4 + 1, 3 + 2, 2 + 3, 1 + 4] -> [5, 5, 5, 5, 5]
    println(addIndexes(listOf(5, 4, 3, 2, 1))) // ➞ [5, 5, 5, 5, 5]
}
