fun arrayValuesTypes(inputArray: Array<Any?>): Array<String> {
    return inputArray.map { element ->
        when (element) {
            is Number -> "number"
            is String -> "string"
            is Boolean -> "boolean"
            is Array<*> -> "object" // Arrays are treated as objects
            null -> "object" // null is also treated as an object
            else -> "unknown" // For any other type
        }
    }.toTypedArray() // Convert the list back to an array
}

fun main() {
    // Test cases
    println(arrayValuesTypes(arrayOf(1, 2, "null", arrayOf<Any>())).contentToString()) // ➞ ["number", "number", "string", "object"]
    println(arrayValuesTypes(arrayOf("214", true, false, 2, 2.15, arrayOf<Any>(), null)).contentToString()) // ➞ ["string", "boolean", "boolean", "number", "number", "object", "object"]
    println(arrayValuesTypes(arrayOf(21.1, "float", "array", arrayOf("I am array"), null, true, 214)).contentToString()) // ➞ ["number", "string", "string", "object", "object", "boolean", "number"]
}
