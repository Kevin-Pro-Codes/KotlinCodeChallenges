import java.util.Date
import java.util.Calendar

fun halloween(date: Date): String {
    // Create a calendar object to extract the month and day
    val calendar = Calendar.getInstance()
    calendar.time = date

    // Check if the month is October (month 9, since Calendar months are 0-based) and the day is 31
    return if (calendar.get(Calendar.MONTH) == 9 && calendar.get(Calendar.DAY_OF_MONTH) == 31) {
        "Bonfire toffee"
    } else {
        "toffee"
    }
}

fun main() {
    // Test cases
    println(halloween(Date(113, 9, 31))) // "Bonfire toffee" (2013/10/31)
    println(halloween(Date(112, 6, 31))) // "toffee" (2012/07/31)
    println(halloween(Date(111, 9, 12))) // "toffee" (2011/10/12)
}
