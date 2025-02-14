fun kmtomiles(kilometers: Double): Double {
    val miles = kilometers * 0.621371
    return String.format("%.5f", miles).toDouble()
}

// Test cases
fun main() {
    println(kmtomiles(2.0))    // ➞ 1.24274
    println(kmtomiles(6.0))    // ➞ 3.72823
    println(kmtomiles(8.0))    // ➞ 4.97097
}
