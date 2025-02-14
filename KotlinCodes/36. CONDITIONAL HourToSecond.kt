fun main () {

    println("Type hour(s) number: ")
    val h = readLine()?.toIntOrNull()

    if (h != null && h >= 0)
    {
        val s = h * 60 * 60
        println ("$h hours is equivalent to $s seconds.")
    }
    else {
        println ("Invalid!")
    }
}