fun wordLengths(words: Array<String>): IntArray {
    return words.map { it.length }.toIntArray()  // Map each word to its length and convert to IntArray
}

fun main() {
    // Example usage
    println(wordLengths(arrayOf("hello", "world")).joinToString(", "))  // Output: [5, 5]
    println(wordLengths(arrayOf("Halloween", "Thanksgiving", "Christmas")).joinToString(", "))  // Output: [9, 12, 9]
    println(wordLengths(arrayOf("She", "sells", "seashells", "down", "by", "the", "seashore")).joinToString(", "))  // Output: [3, 5, 9, 4, 2, 3, 8]
}
