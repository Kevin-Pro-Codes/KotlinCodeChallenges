fun longestWord(input: String): String {
    // Use a regex to split the input string into words, ignoring punctuation and spaces.
    // The regex "\\W+" matches any sequence of non-word characters and splits on them,
    // which effectively isolates words and removes any punctuation.
    val words = input.split(Regex("\\W+"))

    // Use the fold function to find the longest word in the list.
    // Start with an empty string "" as the initial longest word.
    return words.fold("") { longest, current ->
        // For each word in the list, compare its length to the current longest word.
        // If the current word is longer, it becomes the new longest word.
        // Otherwise, the current longest word remains unchanged.
        if (current.length > longest.length) current else longest
    }
}

fun main() {
    // Example sentence with various words and punctuation.
    val sentence = "The quick, brown-fox, jumped over the laziest dog!"

    // Call the longestWord function, passing the example sentence as input.
    // The result will be the longest word found, considering only alphabetical characters.
    val longest = longestWord(sentence)

    // Output the result to the console, showing the longest word found in the sentence.
    // The expected output for this input is "jumps" because it's the longest word.
    println("The longest word is: $longest")  // Output: The longest word is: jumps
}
