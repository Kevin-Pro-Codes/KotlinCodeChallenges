fun reversePsychology(task: String? = null): String {
    return if (task.isNullOrEmpty()) {
        "Do not do anything."
    } else {
        "Do not $task."
    }
}

fun main() {
    println(reversePsychology("wash the dishes"))  // Output: "Do not wash the dishes."
    println(reversePsychology("eat your lunch"))   // Output: "Do not eat your lunch."
    println(reversePsychology("go to school"))     // Output: "Do not go to school."
    println(reversePsychology())                   // Output: "Do not do anything."
}
