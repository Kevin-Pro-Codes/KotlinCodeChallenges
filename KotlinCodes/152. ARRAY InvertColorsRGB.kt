fun colorInvert(rgb: IntArray): IntArray {
    return rgb.map { 255 - it }.toIntArray()  // Invert each color channel
}

fun main() {
    // Example usage
    val color1 = colorInvert(intArrayOf(255, 255, 255))  // ➞ [0, 0, 0]
    val color2 = colorInvert(intArrayOf(0, 0, 0))          // ➞ [255, 255, 255]
    val color3 = colorInvert(intArrayOf(165, 170, 221))    // ➞ [90, 85, 34]

    // Print results
    println(color1.joinToString(", "))  // Output: 0, 0, 0
    println(color2.joinToString(", "))  // Output: 255, 255, 255
    println(color3.joinToString(", "))  // Output: 90, 85, 34
}
