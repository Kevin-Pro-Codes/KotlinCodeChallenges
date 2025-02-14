fun length(input: String): Int {
    var count = 0 // Initialize a counter to 0
    for (char in input) { // Iterate through each character in the string
        count++ // Increment the counter for each character
    }
    return count // Return the total count
}

fun main() {
    // Test cases
    println(length("Hello World")) // ➞ 11
    println(length("Edabit")) // ➞ 6
    println(length("wash your hands!")) // ➞ 16
}
