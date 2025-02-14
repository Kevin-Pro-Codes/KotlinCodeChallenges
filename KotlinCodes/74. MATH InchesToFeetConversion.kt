fun inchesToFeet(inches: Int): Int {
    return inches / 12
}

fun main() {
    println(inchesToFeet(324)) // ➞ 27
    println(inchesToFeet(12))  // ➞ 1
    println(inchesToFeet(36))  // ➞ 3
}
