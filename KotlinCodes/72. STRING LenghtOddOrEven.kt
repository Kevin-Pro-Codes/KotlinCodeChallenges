fun oddOrEven(word: String): Boolean {
    return word.length % 2 == 0
}

fun main() {
    println(oddOrEven("apples"))  // Output: true
    println(oddOrEven("pears"))   // Output: false
    println(oddOrEven("cherry"))  // Output: true
}
