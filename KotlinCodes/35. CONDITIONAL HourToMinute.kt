fun main () {

    println ("Type the hour: ")
    val h = readLine()?.toIntOrNull()

    if (h != null && h >= 0)
    {
      val m = h * 60
        println ("Converting $h hour(s) to $m minutes")
    }
else {
    println ("Invalid!")

    }
}