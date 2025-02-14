fun longBurp(num: Int): String {
    return "B" + "u" + "r".repeat(num) + "p"
}

fun main() {
    println(longBurp(3)) // Output: Burrrp
    println(longBurp(5)) // Output: Burrrrrp
    println(longBurp(9)) // Output: Burrrrrrrrrp
}
