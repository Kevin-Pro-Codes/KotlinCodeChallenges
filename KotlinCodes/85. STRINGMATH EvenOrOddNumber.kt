fun evenOrOdd (n : Int) : String {
    return if (n % 2 == 0) {"Even"}
    else {
        "Odd"
    }
}

fun main () {
    println("Type a number: ")
    val input = readLine()
    val n = input?.toIntOrNull()
    if (n != null) {
        println(evenOrOdd(n))
    }
    else {
        println("Invalid input. Please enter a valid number.")
    }

}