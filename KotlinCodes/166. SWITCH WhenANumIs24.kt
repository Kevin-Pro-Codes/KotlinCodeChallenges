fun main() {
    println(operation(15, 9))    // ➞ "added"
    println(operation(26, 2))    // ➞ "subtracted"
    println(operation(11, 11))   // ➞ null
    println(operation(48, 2))    // ➞ "divided"
}

fun operation(num1: Int, num2: Int): String? {
    return when {
        num1 + num2 == 24 -> "added"
        num1 - num2 == 24 -> "subtracted"
        num1 * num2 == 24 -> "multiplied"
        num1 / num2 == 24 && num1 % num2 == 0 -> "divided" // Only check division if it results in an integer
        else -> null
    }
}
