val operations = mapOf<String, (Int, Int) -> Int>(
    "+" to { a, b -> a + b },
    "-" to { a, b -> a - b },
    "*" to { a, b -> a * b },
    "/" to { a, b -> a / b },
    "%" to { a, b -> a % b }
)

fun operate(num1: Int, num2: Int, operator: String): Int {
    return operations[operator]?.invoke(num1, num2)
        ?: throw IllegalArgumentException("Unknown operator")
}

fun main() {
    println(operate(1, 2, "+"))  // Should output 3
    println(operate(7, 10, "-"))  // Should output -3
    println(operate(20, 10, "%"))  // Should output 0
}
