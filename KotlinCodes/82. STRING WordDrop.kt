fun newWord(word: String): String = word.drop(1)


fun main() {
    println(newWord("apple"))  // Output: pple
    println(newWord("cherry")) // Output: herry
    println(newWord("plum"))   // Output: lum
    println(newWord(""))       // Output: "" (Handles empty input gracefully)
}
