// Function to calculate the net vote count based on upvotes and downvotes
fun getVoteCount(votes: Map<String, Int>): Int {
    // Retrieve the count of upvotes from the map; default to 0 if not found
    val upvotes = votes["upvotes"] ?: 0
    // Retrieve the count of downvotes from the map; default to 0 if not found
    val downvotes = votes["downvotes"] ?: 0
    // Calculate and return the net vote count (upvotes - downvotes)
    return upvotes - downvotes
}

// Main function to execute the program
fun main() {
    // Call getVoteCount with a map of upvotes and downvotes and print the result
    println(getVoteCount(mapOf("upvotes" to 13, "downvotes" to 0)))       // ➞ 13
    // Call getVoteCount with another map and print the result
    println(getVoteCount(mapOf("upvotes" to 2, "downvotes" to 33)))       // ➞ -31
    // Call getVoteCount with equal upvotes and downvotes and print the result
    println(getVoteCount(mapOf("upvotes" to 132, "downvotes" to 132)))    // ➞ 0
}
