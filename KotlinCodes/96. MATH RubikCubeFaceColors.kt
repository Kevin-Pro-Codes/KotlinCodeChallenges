fun howManyStickers(n: Int): Int {
    return 6 * (n * n)
}

fun main() {
    // Test cases
    println(howManyStickers(1))  // Output: 6
    println(howManyStickers(2))  // Output: 24
    println(howManyStickers(3))  // Output: 54
}
