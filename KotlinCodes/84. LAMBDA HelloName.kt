// Arrow function to greet a name
val helloName: (String) -> String = { name -> "Hello $name!" }

// Test cases
fun main() {
    println(helloName("Gerald"))  // Output: "Hello Gerald!"
    println(helloName("Tiffany"))  // Output: "Hello Tiffany!"
    println(helloName("Ed"))       // Output: "Hello Ed!"
}
