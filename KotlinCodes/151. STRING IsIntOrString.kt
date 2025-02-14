fun intOrString(input: Any): String {
    return when (input) {
        is Int -> "int"
        is String -> "str"
        else -> "unknown" // Optional: to handle other types if needed
    }
}

fun main() {
    // Example usage
    println(intOrString(8))          // Output: "int"
    println(intOrString("Hello"))    // Output: "str"
    println(intOrString(9843532))     // Output: "int"
    println(intOrString(3.14))       // Output: "unknown" (if you want to handle other types)
}
