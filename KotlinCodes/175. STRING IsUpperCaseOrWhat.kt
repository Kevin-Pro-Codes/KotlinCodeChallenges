fun getCase(word: String): String {
    val lettersOnly = word.filter { it.isLetter() } // Only keep alphabetic characters

    return when {
        lettersOnly.all { it.isLowerCase() } -> "lower"
        lettersOnly.all { it.isUpperCase() } -> "upper"
        else -> "mixed"
    }
}

fun main() {
    println(getCase("whisper..."))     // ➞ "lower"
    println(getCase("SHOUT!"))         // ➞ "upper"
    println(getCase("Indoor Voice"))   // ➞ "mixed"
}
