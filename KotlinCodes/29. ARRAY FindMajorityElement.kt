// Function to find the majority element in an array using the Boyer–Moore Voting Algorithm
fun findMajorityElement(arr: IntArray): Int? {
    // Initialize candidate to null and a counter to 0
    // `candidate` will hold the potential majority element during the iteration
    // `count` keeps track of the "balance" of the candidate's occurrences
    var candidate: Int? = null
    var count = 0

    // Step 1: Identify a candidate for the majority element by iterating over the array
    for (num in arr) {
        // If `count` is zero, it signifies that we need to choose a new candidate
        if (count == 0) {
            candidate = num // Assign the current number as the new candidate
        }
        // Adjust the count for the current candidate.
        // If the current number matches the candidate, increment the count (indicating support for the candidate).
        // If different, decrement the count (indicating opposition).
        count += if (num == candidate) 1 else -1
    }

    // Step 2: Verify if the selected candidate is actually the majority element
    // Reset counter to count occurrences of the candidate in the array
    count = 0
    for (num in arr) {
        // Increase the count each time the candidate appears
        if (num == candidate) {
            count++
        }
    }

    // Determine if the candidate is the majority element by checking if its
    // occurrences exceed half of the array's size
    return if (count > arr.size / 2) candidate else null // Return the candidate if it qualifies, otherwise null
}

fun main() {
    // Define an example array to pass to the function
    val array = intArrayOf(2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2)

    // Call the `findMajorityElement` function to determine the majority element in the array
    val majorityElement = findMajorityElement(array)

    // Output the result, checking if a majority element was found
    if (majorityElement != null) {
        println("Majority element: $majorityElement") // Expected Output: Majority element: 2
    } else {
        println("No majority element found.") // This message is printed if no majority element exists
    }
}
