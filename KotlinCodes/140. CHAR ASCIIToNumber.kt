fun ctoa(character: Char): Int {
    return character.code // or character.toInt()
}

fun main() {
    // Test cases
    println(ctoa('A'))  // Output: 65
    println(ctoa('m'))  // Output: 109
    println(ctoa('$'))  // Output: 
    println(ctoa('\\')) // Output: 92 (Note: the backslash needs to be escaped)
}
