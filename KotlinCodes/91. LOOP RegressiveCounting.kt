fun main() {
    print("Enter a number to count down from: ")
    val input = readLine()?.toIntOrNull()

    if (input == null || input < 0) {
        println("Please enter a valid positive integer.")
    } else {
        for (i in input downTo 0) {
            println(i)
        }
    }
}

