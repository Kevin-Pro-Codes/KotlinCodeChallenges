fun numStringName (s: String) : Int {
return when (s)
{
    "one" -> 1
    "two" -> 2
    "three" -> 3
    "four" -> 4
    "five" -> 5
    "six" -> 6
    "seven" -> 7
    "eight" -> 8
    "nine" -> 9
    "zero" -> 0
    else -> throw IllegalArgumentException("Invalid number string: $s") // Handles unexpected inputs
}
}

fun main() {
    println(numStringName("one"))    // Output: 1
    println(numStringName("three"))  // Output: 3
    println(numStringName("seven"))  // Output: 7
    println(numStringName("eight"))  // Output: 8
    println(numStringName("zero"))   // Output: 0
    // You can test additional cases by calling stringToNumber with various inputs
}