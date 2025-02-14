fun arrBetween(num1: Int, num2: Int, arr: IntArray): IntArray {
    return arr.filter { it > num1 && it < num2 }.toIntArray() // Filter and convert back to IntArray
}

fun main() {
    // Test cases
    val result1 = arrBetween(3, 8, intArrayOf(1, 5, 95, 0, 4, 7))
    println(result1.joinToString(", ")) // ➞ [5, 4, 7]

    val result2 = arrBetween(1, 10, intArrayOf(1, 10, 25, 8, 11, 6))
    println(result2.joinToString(", ")) // ➞ [8, 6]

    val result3 = arrBetween(7, 32, intArrayOf(1, 2, 3, 78))
    println(result3.joinToString(", ")) // ➞ []
}
