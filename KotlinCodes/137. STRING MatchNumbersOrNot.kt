fun validStrNumbers(str: String): Boolean {
    // Attempt to parse the string to a double
    return str.toDoubleOrNull() != null
}

fun main() {
    println(validStrNumbers("3.2"))     // ➞ true
    println(validStrNumbers("324"))     // ➞ true
    println(validStrNumbers("54..4"))   // ➞ false
    println(validStrNumbers("number"))  // ➞ false
}
