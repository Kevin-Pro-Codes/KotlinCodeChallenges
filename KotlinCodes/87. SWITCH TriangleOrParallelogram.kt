// Function to calculate the area of a triangle or parallelogram
fun areaShape(base: Double, height: Double, shape: String): Double {
    return when (shape.lowercase()) { // Convert the shape input to lowercase for case-insensitivity
        "triangle" -> 0.5 * base * height // Area of triangle = (1/2) * base * height
        "parallelogram" -> base * height // Area of parallelogram = base * height
        else -> throw IllegalArgumentException("Invalid shape type") // Handle invalid shape inputs
    }
}

// Test cases
fun main() {
    println(areaShape(2.0, 3.0, "triangle"))            // Output: 3.0
    println(areaShape(8.0, 6.0, "parallelogram"))       // Output: 48.0
    println(areaShape(2.9, 1.3, "parallelogram"))       // Output: 3.77
}
