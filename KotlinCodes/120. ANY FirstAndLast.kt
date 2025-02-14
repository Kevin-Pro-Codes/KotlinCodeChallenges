fun main() {
    // Declare an array of type Array<Any?>
    val arr: Array<Any?> = arrayOf("Test1", 55, "Test2", 25, "Test3", 123)

    // Print the first and last elements
    if (arr.isNotEmpty()) { // Check if the array is not empty
        val firstElement = arr[0] // Access the first element
        val lastElement = arr[arr.size - 1] // Access the last element
        println("First element: $firstElement")
        println("Last element: $lastElement")
    } else {
        println("The array is empty.")
    }
}
