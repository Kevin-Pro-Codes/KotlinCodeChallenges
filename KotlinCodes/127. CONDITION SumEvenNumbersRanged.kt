fun sumEvenNumsInRange(start: Int, stop: Int): Int {
    var sum = 0 // Initialize the sum variable to accumulate even numbers

    for (i in start..stop) { // Loop through the range from start to stop
        if (i % 2 == 0) { // Check if the number is even
            sum += i // Add the even number to the sum
        }
    }

    return sum // Return the total sum of even numbers
}

fun main() {
    // Test cases
    println(sumEvenNumsInRange(10, 20)) // ➞ 90
    println(sumEvenNumsInRange(51, 150)) // ➞ 5050
    println(sumEvenNumsInRange(63, 97)) // ➞ 1360
}
