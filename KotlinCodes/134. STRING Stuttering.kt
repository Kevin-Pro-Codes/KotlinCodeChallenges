fun stutter(word: String): String {
    // Check if the word has at least 2 letters
    if (word.length < 2) {
        return "$word?"; // If the word is less than 2 characters, return it with a question mark
    }

    // Get the first two letters
    val firstTwo = word.take(2)

    // Create the stuttered version
    return "$firstTwo... $firstTwo... $word?"
}

fun main() {
    // Test cases
    println(stutter("incredible"))    // ➞ "in... in... incredible?"
    println(stutter("enthusiastic"))  // ➞ "en... en... enthusiastic?"
    println(stutter("outstanding"))   // ➞ "ou... ou... outstanding?"
    println(stutter("a"))             // ➞ "a?" (testing single character)
    println(stutter("is"))            // ➞ "is... is... is?" (testing double character)
}
