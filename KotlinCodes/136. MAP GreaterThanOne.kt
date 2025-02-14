fun greaterThanOne(fraction: String): Boolean {
    // Split the input string by "/" to separate the numerator and denominator
    // The `split` function returns a list of strings, so we map each element to an integer
    val (numerator, denominator) = fraction.split("/").map { it.toInt() }

    // Check if the numerator is greater than the denominator
    // If true, it means the fraction is greater than 1
    return numerator > denominator
}

fun main() {
    // Test cases
    println(greaterThanOne("1/2"))   // ➞ false, because 1/2 is less than 1
    println(greaterThanOne("7/4"))   // ➞ true, because 7/4 is greater than 1
    println(greaterThanOne("10/10")) // ➞ false, because 10/10 is exactly 1
}
