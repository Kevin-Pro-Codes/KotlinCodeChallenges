fun imposterFormula(imposters: Int, players: Int): String {
    // Calculate the chance of being an imposter
    val chance = 100 * (imposters.toDouble() / players)
    // Round it to the nearest integer
    val roundedChance = chance.toInt()
    // Return the result as a string with a percentage sign
    return "${roundedChance}%"
}

fun main() {
    // Test cases
    println(imposterFormula(1, 10))  // ➞ "10%"
    println(imposterFormula(2, 5))   // ➞ "40%"
    println(imposterFormula(1, 8))   // ➞ "13%"
    println(imposterFormula(3, 6))   // ➞ "13%"
}