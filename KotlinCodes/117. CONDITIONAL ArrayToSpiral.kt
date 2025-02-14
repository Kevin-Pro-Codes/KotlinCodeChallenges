fun arrayToSpiralMatrix(array: IntArray, rows: Int, cols: Int): Array<IntArray> {
    // Create an empty matrix with the specified dimensions
    val matrix = Array(rows) { IntArray(cols) }

    // Initialize boundary variables
    var top = 0
    var bottom = rows - 1
    var left = 0
    var right = cols - 1
    var index = 0  // To keep track of the current index in the input array

    // Loop until all boundaries cross each other
    while (top <= bottom && left <= right) {
        // Fill the top row from left to right
        for (i in left..right) {
            if (index < array.size) {
                matrix[top][i] = array[index]  // Fill value from array
                index++
            }
        }
        top++  // Move down the top boundary

        // Fill the right column from top to bottom
        for (i in top..bottom) {
            if (index < array.size) {
                matrix[i][right] = array[index]  // Fill value from array
                index++
            }
        }
        right--  // Move left the right boundary

        // Check if there are remaining rows to fill
        if (top <= bottom) {
            // Fill the bottom row from right to left
            for (i in right downTo left) {
                if (index < array.size) {
                    matrix[bottom][i] = array[index]  // Fill value from array
                    index++
                }
            }
            bottom--  // Move up the bottom boundary
        }

        // Check if there are remaining columns to fill
        if (left <= right) {
            // Fill the left column from bottom to top
            for (i in bottom downTo top) {
                if (index < array.size) {
                    matrix[i][left] = array[index]  // Fill value from array
                    index++
                }
            }
            left++  // Move right the left boundary
        }
    }

    return matrix  // Return the filled spiral matrix
}

// Main function to demonstrate the transformation
fun main() {
    // Example input array
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)

    // Define the dimensions of the desired matrix
    val rows = 5
    val cols = 5

    // Transform the array into a spiral matrix
    val spiralMatrix = arrayToSpiralMatrix(array, rows, cols)

    // Print the resulting spiral matrix
    for (row in spiralMatrix) {
        println(row.joinToString(" "))
    }
}
