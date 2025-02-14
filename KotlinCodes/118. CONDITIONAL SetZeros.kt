fun setZeroes(matrix: Array<IntArray>) {
    if (matrix.isEmpty() || matrix[0].isEmpty()) return

    val rows = matrix.size
    val cols = matrix[0].size

    var firstRowHasZero = false
    var firstColHasZero = false

    // Determine if the first row has a zero
    for (j in 0 until cols) {
        if (matrix[0][j] == 0) {
            firstRowHasZero = true
            break
        }
    }

    // Determine if the first column has a zero
    for (i in 0 until rows) {
        if (matrix[i][0] == 0) {
            firstColHasZero = true
            break
        }
    }

    // Use the first row and first column to mark zeros
    for (i in 1 until rows) {
        for (j in 1 until cols) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0  // Mark the first column
                matrix[0][j] = 0  // Mark the first row
            }
        }
    }

    // Set zeros for marked rows and columns
    for (i in 1 until rows) {
        for (j in 1 until cols) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0
            }
        }
    }

    // Set zeros for the first row if needed
    if (firstRowHasZero) {
        for (j in 0 until cols) {
            matrix[0][j] = 0
        }
    }

    // Set zeros for the first column if needed
    if (firstColHasZero) {
        for (i in 0 until rows) {
            matrix[i][0] = 0
        }
    }
}

// Main function to demonstrate the implementation
fun main() {
    // Example input matrix
    val matrix = arrayOf(
        intArrayOf(1, 1, 0, 1, 1),
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(1, 1, 1, 0, 1),
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(0, 1, 1, 1, 1)
    )

    // Print original matrix
    println("Original matrix:")
    for (row in matrix) {
        println(row.joinToString(" "))
    }

    // Set zeroes according to the rules
    setZeroes(matrix)

    // Print modified matrix
    println("\nModified matrix:")
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}
