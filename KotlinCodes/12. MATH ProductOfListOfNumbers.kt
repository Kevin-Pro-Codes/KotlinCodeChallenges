fun productOfList(numbers: List<Int>): Long {
    return numbers.fold(1L) { product, number -> product * number }
}

fun main() {
    val numbers = listOf(10, 21, 32, 4, 15)
    println("The product of the numbers in the list is: ${productOfList(numbers)}")
}
