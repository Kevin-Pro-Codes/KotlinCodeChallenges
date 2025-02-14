fun acceptIntoMovie(age: Int, isSupervised: Boolean): Boolean {
    return age >= 15 || !isSupervised
}

fun main() {
    println(acceptIntoMovie(14, true))    // ➞ true
    println(acceptIntoMovie(14, false))   // ➞ false
    println(acceptIntoMovie(16, false))   // ➞ true
    println(acceptIntoMovie(6, true))
    println(acceptIntoMovie(8, false))
}
