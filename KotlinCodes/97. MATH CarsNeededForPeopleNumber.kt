fun carsNeeded(n: Int): Int {
    val totalCars = n / 5  // Use totalCars to hold the number of complete cars
    return if (n % 5 == 0) totalCars else totalCars + 1 //
}
fun main() {

    println ("Type the number of people: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        println("Number of cars needed: ${carsNeeded(input)}")
    }
    else
    {
        println ("Wrong value!")
    }
}
    // println(carsNeeded(14))  // Output: 3

