fun fifth(vararg args: Any): String {
    return if (args.size < 5) {
        "Not enough arguments"
    } else {
        when (args[4]) {
            is Int, is Double, is Float, is Long -> "number"
            is String -> "string"
            is Boolean -> "boolean"
            else -> args[4]::class.simpleName ?: "unknown"
        }
    }
}

fun main() {
    println(fifth(1, 2, 3, 4, 5))            // ➞ "number"
    println(fifth("a", 2, 3, true, "five"))  // ➞ "string"
    println(fifth())                         // ➞ "Not enough arguments"
}
