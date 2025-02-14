fun AND(a: Int, b: Int): Int {
    return if (a == 1 && b == 1) 1 else 0
}

fun OR(a: Int, b: Int): Int {
    return if (a == 1 || b == 1) 1 else 0
}

fun NOT(a: Int): Int {
    return if (a == 1) 0 else 1
}

fun main() {
    // Test cases for AND
    println(AND(1, 1)) // Output: 1
    println(AND(0, 0)) // Output: 0

    // Test cases for OR
    println(OR(1, 0)) // Output: 1
    println(OR(1, 1)) // Output: 1

    // Test cases for NOT
    println(NOT(0)) // Output: 1
    println(NOT(1)) // Output: 0
}
