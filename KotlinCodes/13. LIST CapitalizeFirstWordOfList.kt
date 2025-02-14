fun capitalizeFirstLetterRecursive(strings: List<String>): List<String> {
    if (strings.isEmpty()) return emptyList()  // Base case: return an empty list if the input list is empty

    val firstString = strings.first()
    val capitalizedString = firstString.replaceFirstChar { it.uppercaseChar() }  // Capitalize the first character

    // Recursive step: process the tail of the list and prepend the capitalized first string
    return listOf(capitalizedString) + capitalizeFirstLetterRecursive(strings.drop(1))
}

fun main() {
    val words = listOf("hello", "world", "this", "is", "kotlin")
    val capitalizedWords = capitalizeFirstLetterRecursive(words)
    println(capitalizedWords)  // Output: [Hello, World, This, Is, Kotlin]
}
