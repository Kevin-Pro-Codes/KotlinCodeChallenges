fun scoreCalculator(easy: Int, medium: Int, hard: Int): Any {
    // Check if any of the inputs are negative
    if (easy < 0 || medium < 0 || hard < 0) {
        return "invalid"
    }

    // Calculate the total score
    val totalScore = (easy * 5) + (medium * 10) + (hard * 20)

    return totalScore
}

// Test the function with the examples
fun main() {
    println(scoreCalculator(1, 2, 3))  // Output: 85
    println(scoreCalculator(1, 0, 10)) // Output: 205
    println(scoreCalculator(5, 2, -6)) // Output: "invalid"
}
