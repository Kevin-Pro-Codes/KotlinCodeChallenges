fun add(char: String, text: String): String {
    // Step 1: Split the input text by spaces into a list of words.
    // This creates a list of strings, with each word in the original text as an element.
    // If there are multiple consecutive spaces, they will result in empty strings in the list.
    val words = text.split(" ")

    // Step 2: Filter out any empty strings from the list.
    // Empty strings can appear in the list if there were multiple consecutive spaces in the text.
    // `filter { it.isNotEmpty() }` keeps only non-empty strings, which represent valid words.
    val filteredWords = words.filter { it.isNotEmpty() }

    // Step 3: Join the list of words using the specified character.
    // `joinToString(char)` will combine all elements in `filteredWords` into a single string,
    // placing the character `char` between each word, effectively removing all spaces from the original text.
    return filteredWords.joinToString(char)
}

fun main() {
    // Example 1
    // This call should insert the character "R" between the words "javascript", "is", and "fun".
    // Expected output: "javascriptRisRfun"
    println(add("R", "javascript is fun"))

    // Example 2
    // This call should insert the character "#" between the words "hello" and "world!".
    // Expected output: "hello#world!"
    println(add("#", "hello world!"))

    // Example 3
    // This call should handle a case where the input text is just a space.
    // Since there are no valid words, an empty string would be returned from filtering.
    // However, the separator character "#" is still used, resulting in the output: "#"
    println(add("#", " "))
}
