fun repeatString(txt: Any, n: Int): String {
    return if (txt is String) {
        txt.repeat(n) // Repeat the string n times
    } else {
        "Not A String !!" // Return this if txt is not a string
    }
}

fun main() {
    // Test cases
    println(repeatString("Mubashir", 2)) // Output: "MubashirMubashir"
    println(repeatString("Matt", 3))      // Output: "MattMattMatt"
    println(repeatString(1990, 7))        // Output: "Not A String !!"
}
