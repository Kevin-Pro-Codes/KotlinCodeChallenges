fun kineticEnergy(m: Double, v: Double): Int {
    return Math.round(0.5 * m * v * v).toInt() // Calculate and round to nearest integer
}

fun main() {
    println(kineticEnergy(60.0, 3.0))   // ➞ 270
    println(kineticEnergy(45.0, 10.0))  // ➞ 2250
    println(kineticEnergy(63.5, 7.35))  // ➞ 1715
}


