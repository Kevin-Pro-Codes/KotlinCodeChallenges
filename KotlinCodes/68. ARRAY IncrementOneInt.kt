fun incrementItems(arr: IntArray): IntArray {
    // Create a new array to store the incremented values
    val incrementedArray = IntArray(arr.size)

    // Iterate over each element, increment it by 1, and store in the new array
    for (i in arr.indices) {
        incrementedArray[i] = arr[i] + 1
    }

    return incrementedArray
}

fun main() {
    println(incrementItems(intArrayOf(0, 1, 2, 3)).joinToString(", "))       // ➞ [1, 2, 3, 4]
    println(incrementItems(intArrayOf(2, 4, 6, 8)).joinToString(", "))       // ➞ [3, 5, 7, 9]
    println(incrementItems(intArrayOf(-1, -2, -3, -4)).joinToString(", "))   // ➞ [0, -1, -2, -3]
}
