fun binaryToDecimal(binaryArray: Array<Int>): Int {
    var decimal = 0
    val size = binaryArray.size

    // Loop through the array from left to right
    for (i in binaryArray.indices) {
        // Multiply each bit by 2^(size - i - 1) and add to decimal
        decimal += binaryArray[i] * Math.pow(2.0, (size - i - 1).toDouble()).toInt()
    }

    return decimal
}

fun main() {
    // Test cases
    println(binaryToDecimal(arrayOf(1, 1, 1, 1, 1, 1, 1, 1))) // ➞ 255
    println(binaryToDecimal(arrayOf(0, 0, 0, 0, 0, 0, 0, 0))) // ➞ 0
    println(binaryToDecimal(arrayOf(1, 0, 1, 1, 1, 1, 0, 0))) // ➞ 188
}
