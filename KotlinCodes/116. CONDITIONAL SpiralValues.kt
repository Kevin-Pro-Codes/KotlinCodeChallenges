// Function to print the elements of a 2D matrix in spiral order
fun printSpiral(matrix: Array<IntArray>) {
    // Check if the matrix is empty; if it is, there is nothing to print
    if (matrix.isEmpty()) return

    // Get the number of rows and columns in the matrix
    val rows = matrix.size
    val cols = matrix[0].size

    // Initialize boundary variables for the spiral traversal
    var top = 0      // Start of the top row
    var bottom = rows - 1  // Start of the bottom row
    var left = 0     // Start of the left column
    var right = cols - 1  // Start of the right column

    // Loop until all boundaries cross each other
    while (top <= bottom && left <= right) {
        // Traverse from the left to right across the topmost row
        for (i in left..right) {
            print("${matrix[top][i]} ")  // Print each element in the top row
        }
        top++  // Move the top boundary down after traversing the top row

        // Traverse from the top to bottom down the rightmost column
        for (i in top..bottom) {
            print("${matrix[i][right]} ")  // Print each element in the right column
        }
        right--  // Move the right boundary left after traversing the right column

        // Check if there are remaining rows to traverse
        if (top <= bottom) {
            // Traverse from right to left across the bottommost row
            for (i in right downTo left) {
                print("${matrix[bottom][i]} ")  // Print each element in the bottom row
            }
            bottom--  // Move the bottom boundary up after traversing the bottom row
        }

        // Check if there are remaining columns to traverse
        if (left <= right) {
            // Traverse from bottom to top up the leftmost column
            for (i in bottom downTo top) {
                print("${matrix[i][left]} ")  // Print each element in the left column
            }
            left++  // Move the left boundary right after traversing the left column
        }
    }
}

// Main function to run the program
fun main() {
    // Define a sample 2D matrix
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(16, 17, 18, 19, 6),
        intArrayOf(15, 24, 25, 20, 7),
        intArrayOf(14, 23, 22, 21, 8),
        intArrayOf(13, 12, 11, 10, 9)
    )

    // Call the function to print the matrix in spiral order
    printSpiral(matrix)
}
