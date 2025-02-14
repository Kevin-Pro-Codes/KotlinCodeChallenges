fun perfectRoots(n: Int): Boolean {
    val secondRoot = Math.pow(n.toDouble(), 1.0 / 2.0).toInt()
    val fourthRoot = Math.pow(n.toDouble(), 1.0 / 4.0).toInt()
    val eighthRoot = Math.pow(n.toDouble(), 1.0 / 8.0).toInt()

    return secondRoot * secondRoot == n &&
            fourthRoot * fourthRoot * fourthRoot * fourthRoot == n &&
            eighthRoot * eighthRoot * eighthRoot * eighthRoot * eighthRoot * eighthRoot * eighthRoot * eighthRoot == n
}

// Test cases
fun main() {
    println(perfectRoots(256))  // ➞ true
    println(perfectRoots(1000)) // ➞ false
    println(perfectRoots(6561)) // ➞ true
}
