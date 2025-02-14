fun wumbo(s: String): String {
    // First, replace 'M' with a temporary placeholder.
    val step1 = s.replace('M', '#')

    // Next, replace 'W' with 'M'.
    val step2 = step1.replace('W', 'M')

    // Finally, replace the placeholder '#' with 'W'.
    return step2.replace('#', 'W')
}

fun main() {
    // Test cases
    println(wumbo("I LOVE MAKING CHALLENGES")) // "I LOVE WAKING CHALLENGES"
    println(wumbo("MEET ME IN WARSAW"))        // "WEET WE IN WARSAW"
    println(wumbo("WUMBOLOGY"))                // "WUWBOLOGY"
    println(wumbo("MWMWMWM"))                  // "WMWMWMW"
}
