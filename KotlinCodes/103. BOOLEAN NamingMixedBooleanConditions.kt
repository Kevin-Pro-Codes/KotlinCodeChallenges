fun minimal(a: Boolean, b: Boolean): String {
    return if (a && b) "both"
    else if (a) "first"
    else if (b) "second"
    else "neither"
}

fun main() {
    // Test cases
    println(minimal(true, true))   // ➞ "both"
    println(minimal(true, false))  // ➞ "first"
    println(minimal(false, true))  // ➞ "second"
    println(minimal(false, false)) // ➞ "neither"
}
