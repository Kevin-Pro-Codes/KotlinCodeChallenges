fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    val pairs = mutableListOf<Pair<Int, Int>>()

    for (i in 0..n) {
        for (j in 0..n) {
            pairs.add(Pair(i, j))
        }
    }

    return pairs
}

fun main() {
    // Test cases
    println(getAllPairs(0)) // Output: [Pair(0, 0)]
    println(getAllPairs(1)) // Output: [Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)]
    println(getAllPairs(2)) // Output: [Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(2, 0), Pair(2, 1), Pair(2, 2)]
}
