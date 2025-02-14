fun helloWorld(number: Int): String {
    return when {
        number % 3 == 0 && number % 5 == 0 -> "Hello World" // Check if it's a multiple of both 3 and 5
        number % 3 == 0 -> "Hello"                            // Check if it's a multiple of 3
        number % 5 == 0 -> "World"                            // Check if it's a multiple of 5
        else -> ""                                           // Return an empty string for other cases (optional)
    }
}

fun main() {
    // Example usages
    println(helloWorld(3))   // Output: "Hello"
    println(helloWorld(5))   // Output: "World"
    println(helloWorld(15))  // Output: "Hello World"
    println(helloWorld(7))   // Output: "" (optional output for no match)
}
