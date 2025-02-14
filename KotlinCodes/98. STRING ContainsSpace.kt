fun hasSpaces(str: String): Boolean {
    return str.contains(' ')
}

fun main() {
    // Test cases
    println(hasSpaces("hello"))          // ➞ false
    println(hasSpaces("hello, world"))   // ➞ true
    println(hasSpaces(" "))               // ➞ true
    println(hasSpaces(""))                // ➞ false
    println(hasSpaces(",./!@#"))          // ➞ false
}
