fun limitNumber(n: Double, lower: Double, upper: Double): Double {
    // Return the number if it's within the range, otherwise return the nearest bound
    return when {
        n < lower -> lower  // If the number is less than the lower bound, return the lower bound
        n > upper -> upper  // If the number is greater than the upper bound, return the upper bound
        else -> n           // If the number is within the range, return it as is
    }
}

fun main() {
    // Test cases
    println(limitNumber(5.0, 1.0, 10.0))  // Output: 5.0
    println(limitNumber(-3.0, 1.0, 10.0)) // Output: 1.0
    println(limitNumber(14.0, 1.0, 10.0)) // Output: 10.0
    println(limitNumber(4.6, 1.0, 10.0))  // Output: 4.6
}
