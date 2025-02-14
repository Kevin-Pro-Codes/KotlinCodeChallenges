fun isPlural(word: String): Boolean {
    // Check if the last character of the word is 's'
    return word.endsWith("s")
}

fun main() {
    // Test cases
    println(isPlural("changes"))  // ➞ true
    println(isPlural("change"))   // ➞ false
    println(isPlural("dudes"))    // ➞ true
    println(isPlural("magic"))    // ➞ false
    println(isPlural("bus"))      // ➞ true
    println(isPlural("busyness")) // ➞ true
    println(isPlural("hero"))     // ➞ false
}
