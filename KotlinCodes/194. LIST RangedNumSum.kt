fun rangeOfNum(start: Int, end: Int): List<Int> {
    return if (start + 1 < end) {
        (start + 1 until end).toList()
    } else {
        emptyList()
    }
}

// Test cases
fun main() {
    println(rangeOfNum(2, 4))    // ➞ [3]
    println(rangeOfNum(5, 9))    // ➞ [6, 7, 8]
    println(rangeOfNum(2, 11))   // ➞ [3, 4, 5, 6, 7, 8, 9, 10]
    println(rangeOfNum(5, 5))    // ➞ []
    println(rangeOfNum(22, 15))
}
