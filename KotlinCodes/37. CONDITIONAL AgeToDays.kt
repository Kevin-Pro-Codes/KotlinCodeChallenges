fun main () {

    println ("Type the age: ")
    val age = readLine()?.toIntOrNull()

  if (age != null && age >= 0)
  {
      val day = age * 365
      println ("Age of $age represents $day days")

  }
else
  {
      println ("Invalid input!")
  }
}