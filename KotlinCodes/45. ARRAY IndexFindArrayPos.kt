// Define a function named 'findIndex' that takes an array of strings ('arr') and a target string ('str')
// Returns the index of 'str' within 'arr', or -1 if the string is not found
fun findIndex(arr: Array<String>, str: String): Int {
    // Use the 'indexOf' method on the array to find the index of the string 'str'
    return arr.indexOf(str)
}

fun main() {
    // Call 'findIndex' with an array containing ["hi", "edabit", "fgh", "abc"] and the target "fgh"
    // Print the result, which is the index of "fgh" in the array (expected output: 2)
    println(findIndex(arrayOf("hi", "edabit", "fgh", "abc"), "fgh")) // Output: 2

    // Call 'findIndex' with an array containing ["Red", "blue", "Blue", "Green"] and the target "blue"
    // Print the result, which is the index of "blue" in the array (expected output: 1)
    println(findIndex(arrayOf("Red", "blue", "Blue", "Green"), "blue")) // Output: 1

    // Call 'findIndex' with an array containing ["a", "g", "y", "d"] and the target "d"
    // Print the result, which is the index of "d" in the array (expected output: 3)
    println(findIndex(arrayOf("a", "g", "y", "d"), "d")) // Output: 3

    // Call 'findIndex' with an array containing ["Pineapple", "Orange", "Grape", "Apple"] and the target "Pineapple"
    // Print the result, which is the index of "Pineapple" in the array (expected output: 0)
    println(findIndex(arrayOf("Pineapple", "Orange", "Grape", "Apple"), "Pineapple")) // Output: 0
}
