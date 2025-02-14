fun intToString(arr: IntArray): String {
    return arr.joinToString(", ")
}

fun main() {
    println(intToString(intArrayOf(5, 15, 25, 35)))
}