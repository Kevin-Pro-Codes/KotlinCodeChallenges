fun filterStringsFromMixedArray(mixedArray: Array<Any>): Array<String> {
    // Use filterIsInstance to filter only strings and convert to an array
    return mixedArray.filterIsInstance<String>().toTypedArray()
}

fun main() {
    val mixedArray: Array<Any> = arrayOf(1, "hello", 2, "world", 3.5, "Kotlin", 4, "5", 'c')

    val stringsOnly = filterStringsFromMixedArray(mixedArray) // Call the function

    println("Filtered strings: ${stringsOnly.joinToString(", ")}") // Print the result
}
