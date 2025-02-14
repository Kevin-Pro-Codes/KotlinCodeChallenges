import kotlin.math.pow

fun calculatePower(a: Int, b: Int): Int {
    val base = a.toDouble()
    val exponent = b.toDouble()
    val result = base.pow(exponent)
    return result.toInt()  // Return result as an Int
}

fun main() {
    val base = 2
    val exponent = 3
    val result = calculatePower(base, exponent)

    println("2 to the power of 3 is $result")  // Output: 2 to the power of 3 is 8
}
