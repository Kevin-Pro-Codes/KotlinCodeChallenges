// Main function - entry point of the program
fun main() {
    // Prompt the user to enter a number to calculate factorials up to
    print("Enter a number to calculate factorials up to: ")

    // Read the input from the user and attempt to convert it to an integer
    val input = readLine()?.toIntOrNull()

    // Check if the input is null (not a number) or negative
    if (input == null || input < 0) {
        println("Please enter a valid non-negative integer.") // Print error message for invalid input
    } else {
        // Print a message indicating the range of factorials to be calculated
        println("Factorials from $input! down to 1!:")

        // Loop through numbers from input down to 1
        for (i in input downTo 1) {
            // Call the computeFactorial function to calculate the factorial of the current number (i)
            val factorialResult = computeFactorial(i)

            // Print the result in the format "n! = factorialResult"
            println("$i! = $factorialResult")
        }
    }
}

// Function to compute the factorial of a given non-negative integer n
fun computeFactorial(n: Int): Long {
    // Initialize result to 1 (the factorial of 0 or 1 is 1)
    var result: Long = 1

    // Loop through numbers from 1 to n, multiplying them to compute the factorial
    for (i in 1..n) {
        result *= i // Multiply the current result by the current number (i)
    }

    // Return the computed factorial result
    return result
}
