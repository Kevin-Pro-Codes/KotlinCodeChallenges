fun sumOfTwo(n1: Int, n2: Int): Int {
    return n1 + n2 // Calculate the area directly and return it
}

fun main() {
    println("Type the first number: ")
    val n1 = readLine()?.toInt() ?: 0 // Read the base input, using 0 as fallback
    println("Type the second number: ")
    val n2 = readLine()?.toInt() ?: 0 // Read the height input, using 0 as fallback

    val res = sumOfTwo(n1, n2)

    if (res >= 100) {
        println("$res is more or equal than 100") //
    }
    else {
        println("$res is less than 100") //
    }
}
