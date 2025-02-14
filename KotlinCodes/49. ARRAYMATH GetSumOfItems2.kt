fun getSumOfItems(arr: Array<Int>): Int {
    var sum = 0  // Initialize a variable to store the sum of the array elements
    for (number in arr) {  // Iterate over each element in the array
        sum += number  // Add each element to the sum
    }
    return sum  // Return the total sum
}

fun main() {
    println(getSumOfItems(arrayOf(2, 7, 4)))  // Output: 13
    println(getSumOfItems(arrayOf(45, 3, 0)))  // Output: 48
    println(getSumOfItems(arrayOf(-2, 84, 23)))  // Output: 105
}
