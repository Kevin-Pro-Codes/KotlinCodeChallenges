import kotlin.math.abs  // Import the abs function to get the absolute value

// Function to calculate the distance James needs to walk to get back home
fun distanceHome(travels: List<Int>): Int {
    // Step 1: Sum all travel distances in the list
    // `sum()` adds up all the integers in `travels`. Positive values represent distances traveled away
    // from home, and negative values represent distances traveled towards home.
    // The sum will represent his final net position relative to home.
    val totalDistance = travels.sum()

    // Step 2: Calculate the absolute distance from home
    // Since James needs to walk back to his starting point, we need the absolute value of `totalDistance`
    // This ensures that distance is always a positive number, as required.
    return abs(totalDistance)
}

fun main() {
    // Example 1
    // James travels 2, 4, 2, and 5 units away each day, so the total distance from home is 2 + 4 + 2 + 5 = 13.
    // Expected output: 13
    println(distanceHome(listOf(2, 4, 2, 5)))  // ➞ 13

    // Example 2
    // James travels -1, -4, -3, and -2 units, meaning each day he moves closer to home.
    // The total distance from home is -1 - 4 - 3 - 2 = -10, so he is actually 10 units from home.
    // Expected output: 10
    println(distanceHome(listOf(-1, -4, -3, -2)))  // ➞ 10

    // Example 3
    // James travels 3 and 4 units away but then moves -5 and -2 units back towards home.
    // The total distance is 3 + 4 - 5 - 2 = 0, meaning he is back at home.
    // Expected output: 0
    println(distanceHome(listOf(3, 4, -5, -2)))  // ➞ 0
}
