fun main() {
    val numbers = mutableListOf<Int>()
    println("Please enter 7 integers:")

    repeat(7) { index ->
        print("Enter number ${index + 1}: ")
        val input = readLine()
        val number = input?.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        } else {
            println("Invalid input. Please enter a valid integer.")
            return
        }
    }

    val oddNumbers = numbers.filter { it % 2 != 0 }

    println("Odd numbers: $oddNumbers")
}
