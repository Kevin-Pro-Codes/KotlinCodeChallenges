fun isDrinksAllowed(a: Int, onBreak: Boolean): Boolean {
    // If onBreak is true, always return false
    if (onBreak) {
        return false
    }
    // Otherwise, allow drinks only if age is 18 or older
    return a >= 18
}

fun main() {
    println(isDrinksAllowed(25, false))
    println(isDrinksAllowed(16, false))
    println(isDrinksAllowed(15, true))
    println(isDrinksAllowed(25, true))
    println(isDrinksAllowed(20, false)) 
}
