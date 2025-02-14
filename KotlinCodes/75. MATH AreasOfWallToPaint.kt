fun howManyWalls(n: Int, w: Int, h: Int): Int {
    val areaOfWall = w * h
    return n / areaOfWall
}

fun main() {
    println(howManyWalls(100, 4, 5))  // ➞ 5
    println(howManyWalls(10, 15, 12)) // ➞ 0
    println(howManyWalls(41, 3, 6))   // ➞ 2
}
