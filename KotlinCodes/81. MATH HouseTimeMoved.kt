fun yearsInOneHouse(age: Int, moves: Int): Double {
    if (moves == 0) return age.toDouble() // Handle the case where they haven't moved
    val numberOfHouses = moves + 1
    return age.toDouble() / numberOfHouses
}

fun main() {
    println(yearsInOneHouse(30, 1)) // Output: 15.0
    println(yearsInOneHouse(15, 2)) // Output: 5.0
    println(yearsInOneHouse(80, 0)) // Output: 80.0
    println(yearsInOneHouse(45,3)) // Output: 11.25
}
