fun isDanny(any : Any?) : String {

    return when (any) {
        "Danny" -> "YES!"
        "anime" -> "YES!"
        "celeb" -> "YES!"
        "famous" -> "YES!"
        "naked" -> "YES!"
        "666" -> "YES!"
        "69" -> "YES!"
        "24" -> "YES!"
        else -> "NO!"
    }
}

fun main () {

    println(isDanny("Danny"))
    println(isDanny("5"))

}

