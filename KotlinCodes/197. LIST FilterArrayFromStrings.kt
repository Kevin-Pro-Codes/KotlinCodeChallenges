fun filterArray(arr: List<Any>): List<Int> {
    return arr.filterIsInstance<Int>()
}

// Test cases
fun main() {
    println(filterArray(listOf(1, 2, 3, "a", "b", 4)))               // ➞ [1, 2, 3, 4]
    println(filterArray(listOf("A", 0, "Edabit", 1729, "Python", "1729"))) // ➞ [0, 1729]
    println(filterArray(listOf("Nothing", "here")))                   // ➞ []
}
