// Define the Calculator class with methods for each operation
class Calculator {

    // Method to add two numbers
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Method to subtract two numbers
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Method to multiply two numbers
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Method to divide two numbers
    fun divide(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw IllegalArgumentException("Cannot divide by zero")
        }
    }
}

// Main function to test the Calculator class
fun main() {
    val calculator = Calculator()

    // Test the add method
    println("10 + 5 = ${calculator.add(10.0, 5.0)}") // Output: 15.0

    // Test the subtract method
    println("10 - 5 = ${calculator.subtract(10.0, 5.0)}") // Output: 5.0

    // Test the multiply method
    println("10 * 5 = ${calculator.multiply(10.0, 5.0)}") // Output: 50.0

    // Test the divide method
    try {
        println("10 / 5 = ${calculator.divide(10.0, 5.0)}") // Output: 2.0
        println("10 / 0 = ${calculator.divide(10.0, 0.0)}") // Should throw an exception
    } catch (e: IllegalArgumentException) {
        println(e.message) // Output: Cannot divide by zero
    }
}
