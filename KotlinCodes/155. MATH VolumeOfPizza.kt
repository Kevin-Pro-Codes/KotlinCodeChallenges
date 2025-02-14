import kotlin.math.PI
import kotlin.math.round

fun volPizza(radius: Double, height: Double): Int {
    // Calculate the volume using the formula and round it to the nearest integer
    return round(PI * radius * radius * height).toInt()
}

fun main() {
    // Example usages
    println(volPizza(1.0, 1.0))   // Output: 3
    println(volPizza(7.0, 2.0))   // Output: 308
    println(volPizza(10.0, 2.5))  // Output: 785
}
