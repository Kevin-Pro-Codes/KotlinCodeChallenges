fun printNumber(n: Int, step: Int): List<Int> {
    // Return an empty list if n is zero
    if (n == 0) return emptyList()

    val result = mutableListOf<Int>()  // Create a mutable list to store the results

    // Loop from n down to 1, decreasing by step
    for (i in n downTo 1 step step) {
        result.add(i) // Add the current number to the result list
    }

    return result // Return the populated list
}

fun main() {
    println(printNumber(0, 1)) // Output: []
    println(printNumber(6, 1)) // Output: [6, 5, 4, 3, 2, 1]
    println(printNumber(6, 2)) // Output: [6, 4, 2]
}
