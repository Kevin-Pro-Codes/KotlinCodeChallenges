fun toNumberArray(stringArray: Array<String>): Array<Double> {
    // Convert each string in the array to a Double
    return stringArray.map { it.toDouble() }.toTypedArray()
}

fun main() {
    // Test cases
    val result1 = toNumberArray(arrayOf("9.4", "4.2"))
    println(result1.joinToString(", "))  // Output: [9.4, 4.2]

    val result2 = toNumberArray(arrayOf("91", "44"))
    println(result2.joinToString(", "))  // Output: [91.0, 44.0]

    val result3 = toNumberArray(arrayOf("9.5", "8.8"))
    println(result3.joinToString(", "))  // Output: [9.5, 8.8]
}
