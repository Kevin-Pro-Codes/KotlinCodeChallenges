import kotlin.math.PI
import kotlin.math.sqrt

fun circleOrSquare(radius: Double, area: Double): Boolean {
    val circumference = 2 * PI * radius          // Calculate circumference of the circle
    val perimeter = 4 * sqrt(area)               // Calculate perimeter of the square

    return circumference > perimeter               // Compare and return true or false
}

fun main() {
    // Example usages
    println(circleOrSquare(16.0, 625.0)) // Output: true
    println(circleOrSquare(5.0, 100.0))   // Output: false
    println(circleOrSquare(8.0, 144.0))   // Output: true
}
