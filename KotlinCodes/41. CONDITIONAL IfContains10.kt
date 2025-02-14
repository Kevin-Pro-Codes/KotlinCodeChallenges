fun main() {
    println("Type first number: ")
    val n1 = readLine()?.toIntOrNull()

    println("Type second number: ")
    val n2 = readLine()?.toIntOrNull()

    if (n1 == null || n2 == null) {
        println("Please enter valid numbers.")
    }
    else
    {
        if (n1 == 10 || n2 == 10) {
            println("These numbers contains 10!")
        }

        if (n1 + n2 == 10) {
            println("Their sum equals 10!")
        }
    }
}
