fun calculateFuturePopulation(population: Long, n: Long): Long {
    val monthsInThreeDecades = 30 * 12  // 30 years, 12 months per year
    return population + (n * monthsInThreeDecades)
}

fun main() {
    val currentPopulation: Long = 7_800_000_000  // Example current world population
    val birthRatePerMonth: Long = 300_000  // Example number of people born per month

    val futurePopulation = calculateFuturePopulation(currentPopulation, birthRatePerMonth)
    println("The population in three decades will be approximately: $futurePopulation")
}
