fun isInRange(number: Double, range: Map<String, Double>): Boolean {
    // Step 1: Use the `in` operator to check if the number is within the range inclusive
    // The range is defined by the values from the "min" key to the "max" key in the map.
    // The `!!` operator is used to ensure the values of "min" and "max" are not null.
    return number in range["min"]!!..range["max"]!!
}

fun main() {
    // Example 1
    // number = 4.0, min = 0.0, max = 5.0
    // 4.0 is between 0.0 and 5.0 (inclusive), so the output is true.
    println(isInRange(4.0, mapOf("min" to 0.0, "max" to 5.0)))  // ➞ true

    // Example 2
    // number = 4.0, min = 4.0, max = 5.0
    // 4.0 is equal to min, so the output is true.
    println(isInRange(4.0, mapOf("min" to 4.0, "max" to 5.0)))  // ➞ true

    // Example 3
    // number = 4.0, min = 6.0, max = 10.0
    // 4.0 is less than the min, so the output is false.
    println(isInRange(4.0, mapOf("min" to 6.0, "max" to 10.0))) // ➞ false

    // Example 4
    // number = 5.0, min = 5.0, max = 5.0
    // 5.0 is equal to both the min and the max, so the output is true.
    println(isInRange(5.0, mapOf("min" to 5.0, "max" to 5.0)))  // ➞ true
}
