fun sumOfOddNums(arr: IntArray): Int {
    var sum = 0 // Initialize sum variable

    // Iterate through each number in the array
    for (n in arr) {
        if (n % 2 != 0) { // Check if the number is odd
            sum += n // Add odd number to the sum
        }
    }

    return sum // Return the total sum of odd numbers
}

fun main() {

    println("Type a number n: ")
    val n = readLine()!!.toInt() // Read an integer input from the user

    // Create an IntArray with numbers from 1 to n
    val numbers = IntArray(n) { it + 1 } // Initializes the array with values 1 to n

    // Calculate the sum of odd numbers in the array
    val sum = sumOfOddNums(numbers)

    // Print the result
    println("The sum of odd numbers from 1 to $n is: $sum")
}
