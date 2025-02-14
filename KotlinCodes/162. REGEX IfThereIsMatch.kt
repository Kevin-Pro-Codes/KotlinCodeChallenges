// Function that checks if a given input string matches a regular expression
fun checkRegex(input: String): Pair<Boolean, String?> {
    // Create a Regex object with the pattern "test" (you can replace "test" with your desired regex pattern)
    val regex = Regex("test")

    // Using containsMatchIn to check for a match in the input string
    // This method returns true if there is a match, otherwise false
    val hasMatch = regex.containsMatchIn(input)

    // Using find to search for the first occurrence of the pattern in the input string
    // find() returns a MatchResult? which can be null if no match is found
    // We use safe call (?.) to get the matched value or null
    val firstMatch = regex.find(input)?.value

    // Return a Pair containing the match result (boolean) and the first match found (String?)
    return Pair(hasMatch, firstMatch)
}

// Main function where the program execution starts
fun main() {
    // Define an input string to search for the pattern
    val inputString = "This is a test string with a certain pattern."

    // Call the checkRegex function with the input string and store the result
    val result = checkRegex(inputString)

    // Print out whether a match was found (true or false)
    println("Contains Match: ${result.first}") // Outputs the boolean result indicating if there was a match
    // Print out the first match found, or null if no match was found
    println("First Match: ${result.second}")    // Outputs the first match if available, or null
}
