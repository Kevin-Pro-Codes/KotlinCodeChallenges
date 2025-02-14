fun findDifference(a: IntArray, b: IntArray): Int {
    val volumeA = a[0] * a[1] * a[2]  // Volume of the first cuboid
    val volumeB = b[0] * b[1] * b[2]  // Volume of the second cuboid
    return Math.abs(volumeA - volumeB) // Return the absolute difference
}

fun main() {
    println(findDifference(intArrayOf(28, 16, 29), intArrayOf(7, 8, 17)))       // Output: 12040
    println(findDifference(intArrayOf(9, 22, 18), intArrayOf(16, 24, 10)))      // Output: 276
    println(findDifference(intArrayOf(1, 9, 25), intArrayOf(10, 7, 9)))         // Output: 405
    println(findDifference(intArrayOf(7, 6, 16), intArrayOf(26, 9, 26)))        // Output: 5412
}
