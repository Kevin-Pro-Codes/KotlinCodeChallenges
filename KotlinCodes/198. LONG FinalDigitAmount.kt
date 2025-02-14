fun findDigitAmount(number: Long): Int {
    return number.toString().length
}

// Test cases
fun main() {
    println(findDigitAmount(123))         // ➞ 3
    println(findDigitAmount(56))          // ➞ 2
    println(findDigitAmount(7154))        // ➞ 4
    println(findDigitAmount(61217311514)) // ➞ 11
    println(findDigitAmount(0))           // ➞ 1
}
