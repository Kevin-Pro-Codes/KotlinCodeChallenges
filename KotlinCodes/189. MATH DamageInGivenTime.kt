// Function to calculate the total damage after a given time
fun damage(damage: Int, speed: Int, timeUnit: String): Any {
    // Check if damage or speed are negative
    if (damage < 0 || speed < 0) {
        return "invalid"
    }

    // Calculate the number of seconds based on the time unit
    val timeInSeconds: Int = when (timeUnit) {
        "second" -> 1  // 1 second
        "minute" -> 60  // 1 minute = 60 seconds
        "hour" -> 3600  // 1 hour = 3600 seconds
        else -> return "invalid"  // Invalid time unit
    }

    // Calculate the total damage
    val totalDamage = damage * speed * timeInSeconds

    return totalDamage
}

// Test the function with the examples
fun main() {
    println(damage(40, 5, "second"))  // Output: 200
    println(damage(100, 1, "minute")) // Output: 6000
    println(damage(2, 100, "hour"))   // Output: 720000
    println(damage(-10, 5, "second")) // Output: "invalid"
    println(damage(40, 5, "day"))     // Output: "invalid"
}
