fun isMood(m: String?): String {
    if (m == "happy") {
        return "Your mood is $m"
    } else if (m == "sad") {
        return "Your mood is $m"
    } else if (m == null || m.isEmpty()) {
        return "Your mood is neutral"
    } else {
        return "You have an unrecognized mood"
    }
}

fun main() {
    println("Type how is your mood: happy, sad or nothing (neutral): ")
    val input = readLine()

    // Pass the input directly to isMood(), allowing it to be null if the user just presses Enter.
    println(isMood(input))
}
