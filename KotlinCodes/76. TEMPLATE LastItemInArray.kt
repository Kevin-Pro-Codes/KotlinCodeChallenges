fun <T> getLastItem(array: Array<T>): T? {
    return array.lastOrNull()
}

fun main() {
    println(getLastItem(arrayOf(1, 2, 3)))               // ➞ 3
    println(getLastItem(arrayOf("cat", "dog", "duck")))  // ➞ "duck"
    println(getLastItem(arrayOf(true, false, true)))     // ➞ true
}