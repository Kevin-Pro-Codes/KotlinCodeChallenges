fun arrayMultByTwo (arr : IntArray) : IntArray {

    return arr.map { it * 2 }.toIntArray()

}

fun main () {

    println(arrayMultByTwo(intArrayOf(1, 5, 7)))

}