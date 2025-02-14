import kotlin.math.sqrt

fun height(side: Double): String {
    // Calculate the height of the equilateral triangle in centimeters
    val heightInCm = (sqrt(3.0) / 2) * side

    // Convert to millimeters
    val heightInMm = heightInCm * 10

    // Round the result to one decimal place and return as a string with "mm"
    return "%.1f mm".format(heightInMm)
}

// Test cases
fun main() {
    println(height(2.0))   // ➞ "17.3 mm"
    println(height(5.0))   // ➞ "43.3 mm"
    println(height(6.2))   // ➞ "53.7 mm"
}
