fun countUniqueValues(arr: List<Int>): Int {
    if (arr.isEmpty()) return 0  // Return 0 if the list is empty

    var uniqueCount = 1  // We have at least one unique value if the array is not empty

    // Iterate through the list starting from the second element
    for (i in 1 until arr.size) {
        if (arr[i] != arr[i - 1]) {  // Compare with the previous element
            uniqueCount++  // Increment the unique count if the current element is different
        }
    }

    return uniqueCount  // Return the count of unique values
}

fun main() {
    println(countUniqueValues(emptyList())) // Output: 0
    println(countUniqueValues(listOf(1, 1, 6))) // Output: 2
    println(countUniqueValues(listOf(-2, -1, -1, 0, 1))) // Output: 4
}
