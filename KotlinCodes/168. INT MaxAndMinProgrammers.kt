fun programmers(wage1: Int, wage2: Int, wage3: Int): Int {
    val maxWage = maxOf(wage1, wage2, wage3)
    val minWage = minOf(wage1, wage2, wage3)
    return maxWage - minWage
}

fun main() {
    println(programmers(147, 33, 526))   // ➞ 493
    println(programmers(33, 72, 74))     // ➞ 41
    println(programmers(1, 5, 9))        // ➞ 8
}