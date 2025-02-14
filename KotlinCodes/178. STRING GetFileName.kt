fun getFilename(path: String): String {
    // Step 1: Split the file path by "/" characters
    // This will separate each directory or file into an element of the list.
    // For example, "C:/Projects/pil_tests/ascii/edabit.txt" becomes:
    // ["C:", "Projects", "pil_tests", "ascii", "edabit.txt"]
    val parts = path.split("/")

    // Step 2: Retrieve the last element of the list
    // The last element in the list is the filename with extension, as it's the part
    // of the path after the final "/" character.
    return parts.last()
}

fun main() {
    // Example 1
    // Path: "C:/Projects/pil_tests/ascii/edabit.txt"
    // Expected output: "edabit.txt"
    println(getFilename("C:/Projects/pil_tests/ascii/edabit.txt"))

    // Example 2
    // Path: "C:/Users/johnsmith/Music/Beethoven_5.mp3"
    // Expected output: "Beethoven_5.mp3"
    println(getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3"))

    // Example 3
    // Path: "ffprobe.exe" (no directories, only a filename)
    // Expected output: "ffprobe.exe"
    println(getFilename("ffprobe.exe"))
}
