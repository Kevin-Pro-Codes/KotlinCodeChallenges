fun firstLast(str: String): String {
    // Check if the string is not empty
    if (str.isNotEmpty()) {
        // Concatenate the first and last character, converting to String
        return str.first().toString() + str.last().toString()
    }
    // Return an empty string if the input string is empty
    return ""
}

fun main() {
    // Test cases
    println(firstLast("ganesh"))  // ➞ "gh"
    println(firstLast("kali"))    // ➞ "ki"
    println(firstLast("shiva"))   // ➞ "sa"
    println(firstLast("vishnu"))  // ➞ "vu"
    println(firstLast("durga"))   // ➞ "da"
    println(firstLast(""))         // ➞ "" (for an empty input)
}
