fun match(str1: String, str2: String): Boolean {
    // Compare the strings by converting both to lowercase
    return str1.lowercase() == str2.lowercase()
}

fun main() {
    // Test cases
    println(match("hello", "hELLo"))      // Output: true
    println(match("motive", "emotive"))   // Output: false
    println(match("venom", "VENOM"))      // Output: true
    println(match("mask", "mAskinG"))     // Output: false
}
