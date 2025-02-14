fun isLeapYear(y: Int): Boolean {
    return if (y % 400 == 0) {
        true
    } else if (y % 100 == 0) {
        false
    } else if (y % 4 == 0) {
        true
    } else {
        false
    }
}

fun main() {
    println("Type a year: ")
    val input = readLine()

    try {
        val y = input!!.toInt()  // Here we use !! to assert that input is not null
        println(isLeapYear(y))
    } catch (e: Exception) {
        // If input is null or conversion fails, handle the exception
        println("Invalid input. Please enter a valid integer.")
    }
}
