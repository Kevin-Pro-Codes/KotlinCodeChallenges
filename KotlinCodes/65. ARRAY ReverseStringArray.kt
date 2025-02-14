fun reverse(arr: IntArray): IntArray {
    return arr.reversedArray()
}

fun main() {
    println(reverse(intArrayOf(1, 2, 3, 4)).joinToString(", "))       // ➞ [4, 3, 2, 1]
    println(reverse(intArrayOf(9, 9, 2, 3, 4)).joinToString(", "))    // ➞ [4, 3, 2, 9, 9]
    println(reverse(intArrayOf()).joinToString(", "))                // ➞ []
}
