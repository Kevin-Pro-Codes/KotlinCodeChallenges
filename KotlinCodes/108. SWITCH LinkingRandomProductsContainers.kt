fun getContainer(product: String): String? {
    return when (product.toLowerCase()) {
        "bread" -> "bag"
        "beer" -> "bottle"
        "candy" -> "plastic"
        else -> null
    }
}

fun main() {
    println("getContainer(\"Bread\") ➞ ${getContainer("Bread")}")
    println("getContainer(\"Beer\") ➞ ${getContainer("Beer")}")
    println("getContainer(\"Candy\") ➞ ${getContainer("Candy")}")
    println("getContainer(\"Cheese\") ➞ ${getContainer("Cheese")}")
}
