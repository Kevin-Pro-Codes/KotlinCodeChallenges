fun dutchNationalFlagSort(arr: IntArray) {
    var low = 0
    var mid = 0
    var high = arr.size - 1

    while (mid <= high) {
        when (arr[mid]) {
            0 -> {
                // Swap arr[low] and arr[mid]
                arr[low] = arr[mid].also { arr[mid] = arr[low] }
                low++
                mid++
            }
            1 -> {
                // Move mid pointer
                mid++
            }
            2 -> {
                // Swap arr[mid] and arr[high]
                arr[high] = arr[mid].also { arr[mid] = arr[high] }
                high--
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0)
    dutchNationalFlagSort(arr)
    println(arr.joinToString(", "))  // Output: 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2
}
