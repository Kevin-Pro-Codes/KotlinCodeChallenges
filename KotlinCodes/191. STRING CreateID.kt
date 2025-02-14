fun createID(firstName: String, lastName: String): String {
    // First character of the first name, in lowercase
    val firstPart = firstName[0].lowercaseChar()

    // First three characters of the last name, with correct capitalization
    val lastPart = lastName.take(3).replaceFirstChar { it.uppercaseChar() }

    // Concatenate the two parts
    return firstPart + lastPart
}

// Test cases
fun main() {
    println(createID("mary", "lamb"))  // ➞ "mLam"
    println(createID("John", "SMITH"))  // ➞ "jSmi"
    println(createID("mary", "smith"))  // ➞ "mSmi"
}
