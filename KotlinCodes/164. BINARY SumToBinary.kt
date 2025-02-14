fun addBinary(a: Int, b: Int): String {
    // Add the two integers and convert the result to a binary string
    return (a + b).toString(2)
}

fun main() {
    println(addBinary(1, 1))  // Output: "10"
    println(addBinary(1, 2))  // Output: "11"
    println(addBinary(4, 5))  // Output: "1001"
}
