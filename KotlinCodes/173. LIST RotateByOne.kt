fun rotateByOne(arr: List<Int>): List<Int> {
    if (arr.isEmpty()) return arr
    return listOf(arr.last()) + arr.dropLast(1)
}

fun main() {
    println(rotateByOne(listOf(1, 2, 3, 4, 5)))     // ➞ [5, 1, 2, 3, 4]
    println(rotateByOne(listOf(6, 5, 8, 9, 7)))     // ➞ [7, 6, 5, 8, 9]
    println(rotateByOne(listOf(20, 15, 26, 8, 4)))  // ➞ [4, 20, 15, 26, 8]
}
