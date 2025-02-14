fun equalSlices(totalSlices: Int, numberOfRecipients: Int, slicesEach: Int): Boolean {
    // Calculate the total slices needed
    val totalNeeded = numberOfRecipients * slicesEach

    // Check if the total slices needed is less than or equal to the total slices available
    return totalNeeded <= totalSlices
}

fun main() {
    // Test cases
    println(equalSlices(11, 5, 2))  // ➞ true
    println(equalSlices(11, 5, 3))  // ➞ false
    println(equalSlices(8, 3, 2))   // ➞ true
    println(equalSlices(8, 3, 3))   // ➞ false
    println(equalSlices(24, 12, 2)) // ➞ true
}
