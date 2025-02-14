fun spaceMeOut(str: String): String {
    return str.toCharArray().joinToString(" ")
}

fun main() {
    println(spaceMeOut("space"))          // Output: "s p a c e"
    println(spaceMeOut("far out"))        // Output: "f a r   o u t"
    println(spaceMeOut("elongated musk")) // Output: "e l o n g a t e d   m u s k"
}
