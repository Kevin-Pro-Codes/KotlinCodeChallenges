fun fiftyThirtyTwenty(ati: Int): Map<String, Int> {
    val needs = (ati * 0.50).toInt()  // Calculate 50% for needs
    val wants = (ati * 0.30).toInt()  // Calculate 30% for wants
    val savings = (ati * 0.20).toInt() // Calculate 20% for savings

    // Return a Map with the calculated values
    return mapOf(
        "Needs" to needs,
        "Wants" to wants,
        "Savings" to savings
    )
}

fun main() {
    // Test cases
    println(fiftyThirtyTwenty(10000))  // ➞ { "Needs": 5000, "Wants": 3000, "Savings": 2000 }
    println(fiftyThirtyTwenty(50000))  // ➞ { "Needs": 25000, "Wants": 15000, "Savings": 10000 }
    println(fiftyThirtyTwenty(13450))  // ➞ { "Needs": 6725, "Wants": 4035, "Savings": 2690 }
}
