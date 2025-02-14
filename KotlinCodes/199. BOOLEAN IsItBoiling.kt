fun isBoiling(temp: String): Boolean {
    return if (temp.endsWith("F")) {
        val fahrenheit = temp.removeSuffix("F").toInt()
        fahrenheit >= 212
    } else if (temp.endsWith("C")) {
        val celsius = temp.removeSuffix("C").toInt()
        celsius >= 100
    } else {
        false
    }
}

// Test cases
fun main() {
    println(isBoiling("212F")) // ➞ true
    println(isBoiling("100C")) // ➞ true
    println(isBoiling("0F"))   // ➞ false
}
