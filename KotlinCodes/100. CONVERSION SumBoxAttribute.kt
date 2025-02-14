fun sumBoxesAttributes(w: Double, l: Double, h: Double): Int {
    return Math.round(w * l * h).toInt()
}

fun main() {
    println(sumBoxesAttributes(15.0, 10.0, 3.0))  // Call the function and print the result
}