fun amazingEdabit(text: String): String {
    return if (text.contains("edabit")) {
        text // Return the original string if "edabit" is present
    } else {
        text.replace("amazing", "not amazing") // Replace "amazing" with "not amazing"
    }
}

fun main() {
    println(amazingEdabit("edabit is amazing.")) // Output: "edabit is amazing."
    println(amazingEdabit("Mubashir is amazing.")) // Output: "Mubashir is not amazing."
    println(amazingEdabit("Infinity is amazing.")) // Output: "Infinity is not amazing."
}
