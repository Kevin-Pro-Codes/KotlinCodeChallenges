fun asciiToChar(ascii: Int): Char {
    return ascii.toChar() // Convert ASCII value to character
}

fun main() {
    // Test cases
    println(asciiToChar(65))  // Output: A
    println(asciiToChar(109)) // Output: m
    println(asciiToChar(91))  // Output: [
    println(asciiToChar(92))  // Output: \ (backslash)
}
