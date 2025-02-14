fun squaresSum(n: Int): Int {
    return (1..n).sumOf { it * it }
}

// Test cases
fun main() {
    println(squaresSum(3))    // ➞ 14
    println(squaresSum(12))   // ➞ 650
    println(squaresSum(13))   // ➞ 819
}
