fun yeah_nope(bool: Boolean): String {
    // Using Kotlin's if expression to simulate a ternary operator
    return if (bool) "yeah" else "nope"
}

fun main() {
    println(yeah_nope(true))   // ➞ "yeah"
    println(yeah_nope(false))  // ➞ "nope"
}
