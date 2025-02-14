fun main() {
    val parenthood: String? = "han"
    val result = when (parenthood) {
        "darth vader" -> "father"
        "leia" -> "sister"
        "han" -> "brother in law"
        "r2d2" -> "droid"
        else -> "Unknown parenthood"
    }

    println(result)
}