fun journeyDistance(cost: Int): Int {
    // If the cost is less than 3, the distance is 0
    if (cost < 3) {
        return 0
    }

    // Start by counting the first kilometer
    var distance = 1 // First kilometer covered by $3

    // Calculate the remaining cost after the first kilometer
    val remainingCost = cost - 3

    // Each additional kilometer costs $2
    // The number of additional kilometers can be calculated using integer division
    distance += remainingCost / 2

    return distance
}

fun main() {
    println(journeyDistance(3))  // Output: 1
    println(journeyDistance(9))  // Output: 4
    println(journeyDistance(35))  // Output: 2
}
