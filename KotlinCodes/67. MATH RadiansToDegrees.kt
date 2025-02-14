fun radiansToDegrees(radians: Double): Double {
    // Convert radians to degrees using the conversion factor
    return radians * (180 / Math.PI)
}

fun main() {
    println(radiansToDegrees(1.0))   // ➞ 57.29577951308232
    println(radiansToDegrees(20.0))  // ➞ 1145.9155902616465
    println(radiansToDegrees(50.0))  // ➞ 2864.7889756541163
}
