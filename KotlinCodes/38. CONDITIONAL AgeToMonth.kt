fun main () {

    println ("Type the age: ")
    val age = readLine()?.toIntOrNull()

if (age != null && age >= 0)
{
    val month = age * 12
    println ("$month months represents the age of $age")

}
else
    println ("Invalid input!")
}