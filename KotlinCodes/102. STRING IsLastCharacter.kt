fun isLastCharacter(name: String): Boolean {
    return name.isNotEmpty() && name.last() == 'n'
}

fun main() {
    // Test cases
    println(isLastCharacter("Aiden"))  // ➞ true
    println(isLastCharacter("Piet"))   // ➞ false
    println(isLastCharacter("Bert"))   // ➞ false
    println(isLastCharacter("Dean"))   // ➞ true
}
