import kotlin.math.pow  // Importing the pow function for exponentiation

// Function to calculate the number of possible combinations of switch positions
fun posCom(switches: Int): Int {
    // Calculate 2 raised to the power of 'switches'.
    // Each switch has 2 possible states: on or off.
    // 2^n gives the total number of combinations for n switches.
    return 2.0.pow(switches).toInt()
    // The power calculation returns a Double, so we convert it to an Int.
}

// Main function to test the posCom function
fun main() {
    // Test case 1: With 1 switch, there are 2 combinations: on and off
    println(posCom(1))   // ➞ 2

    // Test case 2: With 3 switches, there are 2^3 = 8 combinations
    println(posCom(3))   // ➞ 8

    // Test case 3: With 10 switches, there are 2^10 = 1024 combinations
    println(posCom(10))  // ➞ 1024
}
