fun numberArgs(vararg args: Any): Int {
    return args.size
}

fun main() {
    println(numberArgs("a", "b", "c"))   // Output: 3
    println(numberArgs(10, 20, 30, 40, 50))   // Output: 5
    println(numberArgs(1, 2))   // Output: 2
    println(numberArgs())   // Output: 0
}