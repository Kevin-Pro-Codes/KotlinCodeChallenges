// Function to find the index of a given item in a list
fun search(list: List<Int>, target: Int): Int {
    // Iterate through the list with indexes
    for (index in list.indices) {
        // Check if the current item matches the target
        if (list[index] == target) {
            return index // Return the index if found
        }
    }
    return -1 // Return -1 if the item is not found
}

// Test cases
fun main() {
    println(search(listOf(1, 5, 3), 5)) // Output: 1
    println(search(listOf(9, 8, 3), 3)) // Output: 2
    println(search(listOf(1, 2, 3), 4)) // Output: -1
}
