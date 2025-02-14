fun modifyLast(str: String, n: Int): String {
    if (str.isEmpty()) return str  // Handle empty string case
    val lastChar = str.last()
    return str.dropLast(1) + lastChar.toString().repeat(n)
}

fun main() {
    println(modifyLast("Hello", 3)) // Output: Hellooo
    println(modifyLast("hey", 6))    // Output: heyyyyyy
    println(modifyLast("excuse me what?", 5)) // Output: excuse me what?????
}
