fun intToString(number: Int): String {
    return number.toString()
}

fun stringToInt(text: String): Int? {
    return text.toIntOrNull()
}

fun main() {
    // Examples for intToString
    println(intToString(4))       // ➞ "4"
    println(intToString(29348))   // ➞ "29348"

    // Examples for stringToInt
    println(stringToInt("4"))     // ➞ 4
    println(stringToInt("29348")) // ➞ 29348
    println(stringToInt("abc"))   // ➞ null (demonstrating safe conversion)
}
