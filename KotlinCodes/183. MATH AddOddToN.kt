fun addOddToN(n: Int): Int {
    // Since n is an odd number, we calculate how many odd numbers are up to n.
    // We can find this by dividing n by 2 and adding 1 to get the total number of odd numbers.
    val count = (n / 2) + 1

    // The sum of the first `count` odd numbers is simply count^2.
    return count * count
}

fun main() {
    // Test cases
    println(addOddToN(5))   // Output: 9 (1 + 3 + 5)
    println(addOddToN(13))  // Output: 49 (1 + 3 + 5 + 7 + 9 + 11 + 13)
    println(addOddToN(47))  // Output: 576 (1 + 3 + 5 + ... + 47)
}
