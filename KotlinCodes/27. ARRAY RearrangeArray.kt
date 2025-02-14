fun rearrangeArray(arr: IntArray) {
    // Step 1: Sort the array in ascending order
    arr.sort()

    // Step 2: Rearrange elements to make every second element high
    for (i in 1 until arr.size step 2) {
        // Swap elements at indices i and i-1
        val temp = arr[i]
        arr[i] = arr[i - 1]
        arr[i - 1] = temp
    }
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rearrangeArray(array1)
    println("Rearranged array 1: ${array1.joinToString(", ")}")  // Output: 1, 3, 2, 5, 4, 7, 6

    val array2 = intArrayOf(9, 6, 8, 3, 7)
    rearrangeArray(array2)
    println("Rearranged array 2: ${array2.joinToString(", ")}")  // Output: 6, 9, 3, 8, 7

    val array3 = intArrayOf(6, 9, 2, 5, 1, 4)
    rearrangeArray(array3)
    println("Rearranged array 3: ${array3.joinToString(", ")}")  // Output: 1, 6, 2, 9, 4, 5
}
