fun calculateFootballPoints(wins: Int, draws: Int, losses: Int): Int {
    val pointsFromWins = wins * 3
    val pointsFromDraws = draws * 1
    val totalPoints = pointsFromWins + pointsFromDraws
    return totalPoints
}

fun main() {
    println("Enter the number of wins:")
    val wins = readLine()?.toIntOrNull() ?: 0

    println("Enter the number of draws:")
    val draws = readLine()?.toIntOrNull() ?: 0

    println("Enter the number of losses:")
    val losses = readLine()?.toIntOrNull() ?: 0

    val totalPoints = calculateFootballPoints(wins, draws, losses)
    println("The total points for the team are: $totalPoints")
}
