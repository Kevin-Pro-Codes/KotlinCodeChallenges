fun main () {
    println ("Type the seconds: ")
    val seconds = readLine()?.toIntOrNull()

    if (seconds != null && seconds >= 0)
    {
        val minutes = seconds / 60
        println ("$seconds is equal to $minutes minutes")
    }
    else {
        println ("Please insert valid number.")
    }
}