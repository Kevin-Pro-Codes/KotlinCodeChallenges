fun cityFacts (n : String, p : Int, c: String)  {

    println ("$n has a population of $p and is situated in $c")

}

fun main () {
    println ("Type the country: ")
    val input1 = readLine()!!

    println ("Type its population: ")
    val input2 = readLine()?.toIntOrNull() ?: 0

    println ("Type the continent: ")
    val input3 = readLine()!!

   cityFacts(input1, input2, input3)

}
