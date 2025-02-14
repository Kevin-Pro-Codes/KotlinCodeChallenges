fun nSidedShape(sides: Int): String {
    return when (sides) {
        1 -> "circle"
        2 -> "semi-circle"
        3 -> "triangle"
        4 -> "square"
        5 -> "pentagon"
        6 -> "hexagon"
        7 -> "heptagon"
        8 -> "octagon"
        9 -> "nonagon"
        10 -> "decagon"
        else -> "Unknown shape" // Handle cases for numbers outside 1-10
    }
}

fun main() {
    // Example usage
    println(nSidedShape(3))  // Output: triangle
    println(nSidedShape(1))  // Output: circle
    println(nSidedShape(9))  // Output: nonagon
    println(nSidedShape(12)) // Output: Unknown shape
}
