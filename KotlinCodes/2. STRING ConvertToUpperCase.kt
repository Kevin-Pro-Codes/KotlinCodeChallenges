fun main() {
    println("Type a text:")
    val input = readLine() ?: ""

    val capitalizedText = input.split(" ").joinToString(" ") { word ->
        word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }

    println("Uppercased text:")
    println(capitalizedText)
}
