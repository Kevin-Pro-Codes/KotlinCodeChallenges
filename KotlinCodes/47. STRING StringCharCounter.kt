fun stringLength(s: String): Int {
    var count = 0
    for (char in s) {
        count++  // Increment the counter for each character in the string
    }
    return count  // Return the final count as the length of the string
}

fun main() {
    println(stringLength("Hello World"))  // Output: 11
    println(stringLength("Edabit"))  // Output: 6
    println(stringLength("wash your hands!"))  // Output: 16
}
