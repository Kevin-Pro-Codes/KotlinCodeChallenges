fun agetSumOfItems(arr: Array<Int>): Int {
    return arr.sum()
}

fun main() {
    println(agetSumOfItems(arrayOf(2, 7, 4)))  // Output: 13
    println(agetSumOfItems(arrayOf(45, 3, 0)))  // Output: 48
    println(agetSumOfItems(arrayOf(-2, 84, 23)))  // Output: 105
}
