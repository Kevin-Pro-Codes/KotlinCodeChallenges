fun main() {
    println("Enter a number:")
    val input = readLine()?.toIntOrNull()

    if (input != null && input >= 1) {
        var product = 1
        for (i in 1..input) {
            product *= i
        }
        println("The factorial of $input is $product")
    } else {
        println("Please enter a valid positive integer.")
    }
}
