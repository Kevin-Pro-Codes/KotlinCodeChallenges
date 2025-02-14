fun filterIntegersFromMixedArray(mixedArray: Array<Any>): Array<Int> {
    // Use filterIsInstance to filter only integers and convert to an array
    return mixedArray.filterIsInstance<Int>().toTypedArray()
}

fun main() {
    val mixedArray: Array<Any> = arrayOf(1, "hello", 2, "world", 3.5, 4, "5", 6)

    val integersOnly = filterIntegersFromMixedArray(mixedArray) // Call the function

    println("Filtered integers: ${integersOnly.joinToString(", ")}") // Print the result
}
