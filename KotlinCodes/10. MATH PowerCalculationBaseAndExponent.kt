fun power(base: Int, exponent: Int): Int {
    var result = 1  // Initialize result to 1

    // Iterate exponent times, multiplying the result by the base each time
    for (i in 1..exponent) {
        result *= base
    }

    return result  // Return the computed power
}

fun main() {
    // Prompt the user for base and exponent
    print("Enter the base (positive integer): ")
    val baseInput = readLine()
    print("Enter the exponent (positive integer): ")
    val exponentInput = readLine()

    // Validate and parse the base
    val base = baseInput?.toIntOrNull()
    // Validate and parse the exponent
    val exponent = exponentInput?.toIntOrNull()

    // Check if base and exponent are valid positive integers
    if (base != null && exponent != null && base >= 0 && exponent >= 0) {
        // Calculate and display the result
        val result = power(base, exponent)
        println("$base raised to the power of $exponent is: $result")
    } else {
        println("Invalid input. Please enter positive integers for both base and exponent.")
    }
}
