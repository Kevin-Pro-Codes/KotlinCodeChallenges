import kotlin.random.Random

fun main() {
    print("Enter the start of the range: ")
    val startInput = readLine()
    val start = startInput?.toIntOrNull()

    if (start == null) {
        println("Invalid input for start of the range.")
        return
    }

    print("Enter the end of the range: ")
    val endInput = readLine()
    val end = endInput?.toIntOrNull()

    if (end == null) {
        println("Invalid input for end of the range.")
        return
    }

    if (start > end) {
        println("Invalid range. The start should be less than or equal to the end.")
        return
    }

    // Generate the random number once, outside the loop
    val randomNumber = Random.nextInt(start, end + 1)
    println("Guess the number between $start and $end.")

    var guessedCorrectly = false
    while (!guessedCorrectly) {
        print("Type a number to guess: ")

        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Please enter a valid number.")
            continue
        }

        if (guess > end || guess < start) {
            println("INVALID NUMBER!")

        }

        if (guess == randomNumber) {
            println("On shot! You typed the correct number.")
            guessedCorrectly = true
            break

        } else {
            println("Not the right number.")
        }

        if (randomNumber >= guess) {

            println ("Your guess is less than the GOLDEN NUMBER!")
        }
        else if (randomNumber <= guess)
        {
            println ("Your guess is more than the GOLDEN NUMBER!")
        }
    }
}
