fun main () {

    println ("Converta minutos em segundos: ")
    val minutes = readLine()?.toIntOrNull()

    if (minutes != null && minutes >= 0) {
        val seconds = minutes * 60
        println("$minutes minutos equivalem a $seconds segundos.")
    } else {
        println("Por favor, insira um número válido de minutos.")
    }


}