fun numberIsWhat(n: Int): String {
    return if (n == 100) {
        "Equal to 100."
    } else if (n > 100) {
        "Greater than 100."
    } else if (n < 100) {
        "Less than 100."
    } else {
        // This is just a safeguard, though not strictly necessary
        // because all valid integers are covered in the conditions above.
        "Unexpected case."
    }
}

fun main() {
    println("Type a value: ")
    val input = readLine()?.toIntOrNull()
    if (input != null) {
        println("Typed value is $input")
        val result = numberIsWhat(input)
        println(result)
    } else {
        println("Invalid input, please enter a valid number.")
    }
}
