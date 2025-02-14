fun skipTooMuchSugarDrinks(drinks: List<String>): List<String> {
    // Step 1: Use the `filter` function to exclude "cola" and "fanta" from the list
    // `filter` will return a new list that includes only the drinks that are NOT "cola" and NOT "fanta"
    return drinks.filter { it != "cola" && it != "fanta" }
}

fun main() {
    // Example 1
    // The input list contains "fanta", "cola", and "water".
    // "fanta" and "cola" are excluded because they contain sugar.
    // Only "water" remains, so the output is ["water"].
    println(skipTooMuchSugarDrinks(listOf("fanta", "cola", "water")))   // ➞ ["water"]

    // Example 2
    // The input list contains "fanta" and "cola".
    // Both "fanta" and "cola" are excluded because they contain sugar.
    // The output is an empty list [].
    println(skipTooMuchSugarDrinks(listOf("fanta", "cola")))           // ➞ []

    // Example 3
    // The input list contains "lemonade", "beer", and "water".
    // None of these drinks contain sugar, so they all remain in the list.
    // The output is ["lemonade", "beer", "water"].
    println(skipTooMuchSugarDrinks(listOf("lemonade", "beer", "water"))) // ➞ ["lemonade", "beer", "water"]
}
