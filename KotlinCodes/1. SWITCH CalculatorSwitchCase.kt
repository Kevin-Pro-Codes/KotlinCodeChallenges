fun main() {
    println("Enter first number:")
    val number1 = readLine()!!.toDouble()

    println("Enter second number:")
    val number2 = readLine()!!.toDouble()

    println("Enter an operator (+, -, *, /):")
    val operator = readLine()

    val result = when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> number1 / number2
        else -> {
            println("Error! Operator is not correct")
            return
        }
    }

    println("The result is: $result")
}