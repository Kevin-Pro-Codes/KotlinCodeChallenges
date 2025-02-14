fun absolute(number: Double): Double {
    return Math.abs(number)
}

fun main() {
    // Test cases
    println(absolute(-1.217197940))  // ➞ 1.21719794
    println(absolute(-12.1320))      // ➞ 12.132
    println(absolute(-544.0))        // ➞ 544
    println(absolute(4666.0))        // ➞ 4666
    println(absolute(-3.14))         // ➞ 3.14
    println(absolute(250.0))         // ➞ 250
}
