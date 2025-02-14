fun main () {

    println ("Type the minute: ")
    val m = readLine()?.toIntOrNull()

   if (m != null && m >= 0)
   {
     val h = m / 60
     println ("Converting $m minutes in $h hours...")
   }
   else
   {
       println ("Please insert valid number.")
   }
}