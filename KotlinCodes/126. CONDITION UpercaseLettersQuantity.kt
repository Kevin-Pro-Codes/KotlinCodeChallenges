fun capitalLetters(str: String): Int {
    var count = 0
    for (char in str) {
        if (char.isUpperCase()) {
            count++
        }
    }
    return count
}

fun main() {
    // Test cases
    println(capitalLetters("fvLzpxmgXSDrobbgMVrc")) // ➞ 6
    println(capitalLetters("JMZWCneOTFLWYwBWxyFw")) // ➞ 14
    println(capitalLetters("mqeytbbjwqemcdrdsyvq")) // ➞ 0
}
