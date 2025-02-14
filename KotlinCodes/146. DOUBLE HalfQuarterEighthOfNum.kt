fun halfQuarterEighth(num: Double): DoubleArray {
    val half = num / 2
    val quarter = num / 4
    val eighth = num / 8
    return doubleArrayOf(half, quarter, eighth)
}

fun main() {
    // Example usage
    val result1 = halfQuarterEighth(6.0)
    val result2 = halfQuarterEighth(22.0)
    val result3 = halfQuarterEighth(25.0)

    println(result1.joinToString(", "))  // Output: 3.0, 1.5, 0.75
    println(result2.joinToString(", "))  // Output: 11.0, 5.5, 2.75
    println(result3.joinToString(", "))  // Output: 12.5, 6.25, 3.125
}
