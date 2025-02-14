// Function to calculate the sum of all integers from 1 to n
fun addUpTo(n: Int): Int {
    // Return the result using the formula for the sum of the first n natural numbers
    return n * (n + 1) / 2
}

fun main() {
    // Prompt the user to type the size of the array (though it's actually the upper limit of the sum)
    println("Type the size of array:")

    // Read the user's input from the console and attempt to convert it to an integer
    // If the input isn't a valid number, toIntOrNull() will return null
    val input = readLine()?.toIntOrNull()

    // Check if the input conversion to integer was successful (i.e., input is not null)
    if (input != null) {
        // Calculate and print the sum of numbers from 1 to input by calling addUpTo
        println("Sum of numbers from 1 to $input is: ${addUpTo(input)}")
    } else {
        // Inform the user in case of invalid input
        println("Invalid input.")
    }
}
