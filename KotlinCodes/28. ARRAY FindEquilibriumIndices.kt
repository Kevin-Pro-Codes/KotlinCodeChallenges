fun findEquilibriumIndices(arr: IntArray): List<Int> {
    val result = mutableListOf<Int>() // List to store the equilibrium indices
    val totalSum = arr.sum() // Calculate total sum of the array
    var leftSum = 0 // Initialize the left sum

    // Iterate through the array
    for (i in arr.indices) {
        // Calculate right sum as totalSum - leftSum - arr[i]
        val rightSum = totalSum - leftSum - arr[i]

        // Check if the left sum is equal to the right sum
        if (leftSum == rightSum) {
            result.add(i) // If they are equal, add index to the result
        }

        // Update the left sum for the next iteration
        leftSum += arr[i]
    }

    return result // Return the list of equilibrium indices
}

fun main() {
    val array = intArrayOf(0, -3, 5, -4, -2, 3, 1, 0)
    val equilibriumIndices = findEquilibriumIndices(array)

    // Print the equilibrium indices
    println("Equilibrium indices: ${equilibriumIndices.joinToString(", ")}") // Expected Output: Equilibrium indices: 0, 3, 7
}
