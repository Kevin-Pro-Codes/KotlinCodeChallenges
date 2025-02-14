fun validStrNumber(str: String): Boolean {
    // Use regex to validate the number format
    val regex = Regex("^-?(0|[1-9]\\d*)(\\.\\d+)?$|^-?\\.\\d+$")
    return regex.matches(str)
}

fun main() {
    // Test cases
    println(validStrNumber("3.2"))       // ➞ true
    println(validStrNumber("324"))       // ➞ true
    println(validStrNumber("54..4"))     // ➞ false
    println(validStrNumber("number"))     // ➞ false
    println(validStrNumber("-12.34"))    // ➞ true
    println(validStrNumber("0"))          // ➞ true
    println(validStrNumber(""))           // ➞ false
    println(validStrNumber("0003"))
    println(validStrNumber(".5"))
}
