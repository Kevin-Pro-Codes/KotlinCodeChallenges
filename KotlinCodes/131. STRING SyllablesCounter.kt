fun countSyllables(word: String): Int {
    // Define the vowels
    val vowels = "aeiouAEIOU"
    var count = 0

    // Loop through each character in the input string
    for (char in word) {
        // Check if the character is a vowel
        if (char in vowels) {
            count++
        }
    }

    return count // Return the total count of syllables
}

fun main() {
    // Test cases
    println(countSyllables("Hehehehehehe")) // ➞ 6
    println(countSyllables("bobobobobobobobo")) // ➞ 8
    println(countSyllables("NANANA")) // ➞ 3
    println(countSyllables("Lalalalalalala")) // ➞ 7
    println(countSyllables("Syllable")) // ➞ 3
}
