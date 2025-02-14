// Function to convert a constant name (e.g., FOO_BAR) to a camelCase variable name (e.g., fooBar)
fun convertToCamelCase(constant: String): String {
    return constant
        .toLowerCase() // Convert the entire string to lowercase for uniformity
        .split('_') // Split the string by underscores, producing a list of words
        .mapIndexed { index, word ->
            // Use mapIndexed to iterate over each word with its index
            if (index == 0)
                word // If it's the first word, return it in lowercase
            else
                word.replaceFirstChar { it.uppercaseChar() } // Capitalize the first character of subsequent words
        }
        .joinToString("") // Join all the words without spaces or underscores to form the camelCase string
}

// Main function to test the conversion
fun main() {
    val constantName = "KEVIN_FERREIRA" // Example constant name
    val variableName = convertToCamelCase(constantName) // Convert it to camelCase
    println(variableName) // Print the converted variable name; expected output: fooBar
}
