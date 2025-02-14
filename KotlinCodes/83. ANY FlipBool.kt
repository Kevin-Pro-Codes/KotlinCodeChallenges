// Function to flip the value of a boolean or a number (interpreting numbers as Boolean)
fun flipBool(value: Any): Int {
    // Using a 'when' expression to determine the type of the input value
    return when (value) {
        // If 'value' is of type Boolean
        is Boolean ->
            // Check if 'value' is true
            if (value)
            // Return 0 if true
                0
            else
            // Return 1 if false
                1

        // If 'value' is of type Number
        is Number ->
            // Convert the number to an integer and check if it's equal to 0
            if (value.toInt() == 0)
            // If the number is 0, return 1 (interpreted as false)
                1
            else
            // Otherwise, return 0 (any non-zero number is interpreted as true)
                0

        // If 'value' is neither a Boolean nor a Number, throw an exception
        else ->
            throw IllegalArgumentException("Input must be a Boolean or a Number")
    }
}

// Main function to test the flipBool function
fun main() {
    // Test case: Input true should yield 0 (flipped value)
    println(flipBool(true))  // Output: 0

    // Test case: Input false should yield 1 (flipped value)
    println(flipBool(false)) // Output: 1

    // Test case: Input 1 should yield 0 (flipped value of a non-zero number)
    println(flipBool(1))     // Output: 0

    // Test case: Input 0 should yield 1 (flipped value interpreted as false)
    println(flipBool(0))     // Output: 1
}
