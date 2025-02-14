fun formatTrainRoute(stations: List<String>): String {
    return when (stations.size) {
        0 -> "Train is not calling at any stations."
        1 -> "Train is calling at ${stations[0]}."
        else -> {
            val allButLast = stations.dropLast(1).joinToString(", ")
            val last = stations.last()
            "Train is calling at $allButLast and $last."
        }
    }
}

fun main() {
    val stations = mutableListOf<String>()

    println("Enter train station names. Use 'and' to separate additional station names (e.g., Station1 and Station2 and Station3).")

    print("Enter station names: ")
    val input = readLine()

    if (input != null) {
        // Split the input by "and" to handle multiple entries
        val splitStations = input.split("and").map { it.trim() }

        // Filter out any empty station names
        stations.addAll(splitStations.filter { it.isNotEmpty() })

        if (stations.isNotEmpty()) {
            val result = formatTrainRoute(stations)
            println(result)
        } else {
            println("No valid station names provided.")
        }
    } else {
        println("Invalid input.")
    }
}
