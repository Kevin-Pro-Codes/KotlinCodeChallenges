fun main() {
    var count = 0

    while (true) {
        print("\r$count") // Use carriage return to overwrite the line
        count++ // Increment the count
        Thread.sleep(1000) // Sleep for 1 second
    }
}
