fun totalCups(bought: Int): Int {
    // Calculate the number of free cups earned
    val freeCups = bought / 6
    // Total cups is the sum of bought cups and free cups
    return bought + freeCups
}

fun main() {
    println(totalCups(6))    // Output: 7
    println(totalCups(12))   // Output: 14
    println(totalCups(213))  // Output: 248
}
