fun futurePeople(population: Int, n: Int): Int {
    val monthsInThreeDecades = 30 * 12  // Calculating total months in 30 years
    val totalNewPeople = n * monthsInThreeDecades  // Total people added over 30 years
    return population + totalNewPeople  // Future population after 30 years
}

fun main() {
    println(futurePeople(256, 2))  // Output: 976
    println(futurePeople(3248, 6))  // Output: 5408
    println(futurePeople(5240, 3))  // Output: 6320
}
