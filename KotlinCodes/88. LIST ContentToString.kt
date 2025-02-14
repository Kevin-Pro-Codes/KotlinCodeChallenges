// Function to convert an array or list to a string
fun arrayToString(array: List<Any>): String {
    return array.joinToString(" ") // Creates a single string by joining all elements without any separator
}

// Test cases
fun main() {
    println(arrayToString(listOf(1, 2, 3, 4, 5, 6))) // Output: "123456"
    println(arrayToString(listOf("a", "b", "c", "d", "e", "f"))) // Output: "abcdef"
    println(arrayToString(listOf(1, 2, 3, "a", "s", "dAAAA"))) // Output: "123asdAAAA"
}
