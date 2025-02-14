fun areaOfTriangle(b: Int, h: Int): Int {
    return b * h / 2 // Calculate the area directly and return it
}

fun main() {
    println("Type the base: ")
    val b = readLine()?.toInt() ?: 0 // Read the base input, using 0 as fallback
    println("Type the height: ")
    val h = readLine()?.toInt() ?: 0 // Read the height input, using 0 as fallback

    val area = areaOfTriangle(b, h) // Call the function to get the area
    println("The area of the triangle is: $area") // Print the calculated area
}
