fun rangeContains(range1: IntRange, range2: IntRange): Boolean {
    return range1.first <= range2.first && range1.last >= range2.last
}

fun main() {
    // Case 1: True
    val range1a = 10..30
    val range2a = 15..25
    println("Case 1:")
    println("Range1: $range1a")
    println("Range2: $range2a")
    println("Range1 contains Range2: ${rangeContains(range1a, range2a)}")
    println()

    // Case 2: True
    val range1b = 5..20
    val range2b = 5..10
    println("Case 2:")
    println("Range1: $range1b")
    println("Range2: $range2b")
    println("Range1 contains Range2: ${rangeContains(range1b, range2b)}")
    println()

    // Case 3: False
    val range1c = 10..20
    val range2c = 15..30
    println("Case 3:")
    println("Range1: $range1c")
    println("Range2: $range2c")
    println("Range1 contains Range2: ${rangeContains(range1c, range2c)}")
    println()
}
