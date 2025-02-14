fun main() {
    // Define a two-dimensional array (matrix) with three rows and three columns.
    val matriz = arrayOf(
        intArrayOf(1, 2, 3), // First row
        intArrayOf(4, 5, 6), // Second row
        intArrayOf(7, 8, 9)  // Third row
    )

    // Create an array to store the sum of each row.
    // The size of this array matches the number of rows in the matrix.
    val somaLinhas = IntArray(matriz.size)

    // Loop through each row of the matrix
    for (i in matriz.indices) { // `indices` gives the range of valid indices for the array
        // Loop through each element of the current row
        for (j in matriz[i].indices) { // `matriz[i].indices` gives the range of valid indices for the current row
            // Add the value of the current element to the corresponding index in the sum array
            somaLinhas[i] += matriz[i][j]
        }
    }

    // Loop to display the sum of each row
    for (i in somaLinhas.indices) { // Loop through the indices of the `somaLinhas` array
        // Print the sum of the current row (i + 1 for visual representation of row number)
        println("Soma da linha ${i + 1}: ${somaLinhas[i]}")
    }
}
