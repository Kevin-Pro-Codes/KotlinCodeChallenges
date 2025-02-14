// This function counts the number of arguments passed to it
fun numArgs(vararg args: Any?): Int {
    // 'vararg' allows the function to accept any number of arguments
    // 'Any?' means the arguments can be of any type, including null
    // The arguments are collected into an array called 'args'

    // Returns the size of the 'args' array, which is the number of arguments passed
    return args.size
}

fun main() {
    // Calls numArgs with no arguments
    println("numArgs() ➞ ${numArgs()}")

    // Calls numArgs with one string argument
    println("numArgs(\"foo\") ➞ ${numArgs("foo")}")

    // Calls numArgs with two string arguments
    println("numArgs(\"foo\", \"bar\") ➞ ${numArgs("foo", "bar")}")

    // Calls numArgs with two boolean arguments
    println("numArgs(true, false) ➞ ${numArgs(true, false)}")

    // Calls numArgs with an empty map as an argument
    // mapOf<String, String>() creates an empty map which is passed as a single argument
    println("numArgs({}) ➞ ${numArgs(mapOf<String, String>())}")
}
