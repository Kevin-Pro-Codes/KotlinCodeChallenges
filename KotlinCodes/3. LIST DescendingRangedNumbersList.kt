fun stepsFromNto0(n: Int): List<Int> {
    return (n downTo 0).toList()
}

fun main() {
    println("Please enter a positive integer:")

    val input = readLine()
    val n = input?.toIntOrNull()

    if (n != null && n >= 0) {
        val stepsList = stepsFromNto0(n)
        println("Steps from $n to 0: $stepsList")
    } else {
        println("Invalid input. Please enter a positive integer.")
    }
}
