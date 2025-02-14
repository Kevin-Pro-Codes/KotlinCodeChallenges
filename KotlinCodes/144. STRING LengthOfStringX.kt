fun lengthOfString(str: String): Int {
    var count = 0
    for (char in str) {
        count++ // Increment count for each character
    }
    return count // Return the total count
}

fun main() {
    // Test cases
    println(lengthOfString("Hello World"))       // Output: 11
    println(lengthOfString("Edabit"))            // Output: 6
    println(lengthOfString("wash your hands!"))  // Output: 16
}
