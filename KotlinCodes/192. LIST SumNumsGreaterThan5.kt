fun sumFive(arr: List<Int>): Int {
    return arr.filter { it > 5 }.sum()
}

// Test cases
fun main() {
    println(sumFive(listOf(1, 5, 20, 30, 4, 9, 18)))  // ➞ 77
    println(sumFive(listOf(1, 2, 3, 4)))             // ➞ 0
    println(sumFive(listOf(10, 12, 28, 47, 55, 100))) // ➞ 252
}
