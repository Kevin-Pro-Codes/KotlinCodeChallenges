fun returnNegative(number: Int): Int {
    return if (number > 0) -number else number
}

fun main() {
    println(returnNegative(4))    // ➞ -4
    println(returnNegative(15))   // ➞ -15
    println(returnNegative(-4))   // ➞ -4
    println(returnNegative(0))    // ➞ 0
}
