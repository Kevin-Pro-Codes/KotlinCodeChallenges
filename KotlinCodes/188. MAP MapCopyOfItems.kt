// Function that takes a map and returns a copy of that map
fun makeCopy(stolenItems: Map<String, Int>): Map<String, Int> {
    // Create a copy of the map
    return stolenItems.toMap()
}

// Main function to test the makeCopy function
fun main() {
    val stolenItems = mapOf("piano" to 100, "tv" to 50)

    // Get a copy of the stolenItems map
    val copiedItems = makeCopy(stolenItems)

    // Print the copied map
    println(copiedItems)  // Output: {piano=100, tv=50}
}
