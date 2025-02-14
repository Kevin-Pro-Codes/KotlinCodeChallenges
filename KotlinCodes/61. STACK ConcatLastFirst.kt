fun concatName(firstName: String, lastName: String): String {
    return "$lastName, $firstName" // Concatenate last and first names
}

fun main() {
    // Test cases
    println(concatName("First", "Last")) // Output: Last, First
    println(concatName("John", "Doe")) // Output: Doe, John
    println(concatName("Mary", "Jane")) // Output: Jane, Mary
}
