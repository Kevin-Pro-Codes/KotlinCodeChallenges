fun invertArray(arr: List<Int>): List<Int> {
    return arr.map { -it }
}

fun main() {
    println(invertArray(listOf(1, 2, 3, 4, 5)))      // ➞ [-1, -2, -3, -4, -5]
    println(invertArray(listOf(1, -2, 3, -4, 5)))    // ➞ [-1, 2, -3, 4, -5]
    println(invertArray(emptyList()))                // ➞ []
}
