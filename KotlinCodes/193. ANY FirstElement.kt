fun elementSet(s: Set<Any>): Any? {
    return s.firstOrNull()
}

// Test cases
fun main() {
    val first = setOf(1)
    println(elementSet(first)) // ➞ 1

    val second = setOf("apple")
    println(elementSet(second)) // ➞ "apple"

    val third = setOf(false)
    println(elementSet(third)) // ➞ false
}
