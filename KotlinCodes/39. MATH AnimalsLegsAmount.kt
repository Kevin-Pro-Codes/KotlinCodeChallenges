fun totalAnimalLegs(): Int {
    println("How many chickens? ")
    val chicken = readLine()?.toIntOrNull() ?: 0

    println("How many cows? ")
    val cow = readLine()?.toIntOrNull() ?: 0

    println("How many pigs? ")
    val pig = readLine()?.toIntOrNull() ?: 0

    val animal1 = chicken * 2
    val animal2 = cow * 4
    val animal3 = pig * 4

    val totalLegs = animal1 + animal2 + animal3

    println("The amount of legs overall for chickens are: $animal1, for cows are: $animal2, for pigs are: $animal3")
    return totalLegs
}

fun main() {
    val totalLegs = totalAnimalLegs()
    println("All the legs are: $totalLegs")
}
