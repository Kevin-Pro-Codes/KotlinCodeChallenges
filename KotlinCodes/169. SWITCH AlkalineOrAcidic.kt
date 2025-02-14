fun alkalineOrAcidic(n: Double): String {
    return when {
        n > 7 -> "Alkaline"       // pH greater than 7 is alkaline
        n < 7 -> "Acidic"         // pH less than 7 is acidic
        else -> "Neutral"         // pH equal to 7 is neutral
    }
}

fun main() {
    println(alkalineOrAcidic(8.5))   // ➞ "Alkaline"
    println(alkalineOrAcidic(6.2))   // ➞ "Acidic"
    println(alkalineOrAcidic(7.0))   // ➞ "Neutral"
}
