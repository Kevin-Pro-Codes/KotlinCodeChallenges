fun sortWord(word: String): String {
    return word.toCharArray()
        .sortedWith(compareBy { it.lowercase() }) // Sort by the lowercase version of each character
        .joinToString("") // Converts sorted characters back to a string
}

fun main() {
    println(sortWord("dcba")) // Output: "abcd"
    println(sortWord("Unpredictable")) // Output: "Uabcdeeilnprt"
    println(sortWord("pneumonoultramicroscopicsilicovolcanoconiosis")) // Output: "aacccccceiiiiiilllmmnnnnooooooooopprrsssstuuv"
    println(sortWord("HelloWorld")) // Output: "Hdellloorw"
}
