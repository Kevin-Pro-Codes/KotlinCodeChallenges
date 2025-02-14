fun hasSameBread(sandwich1: Array<String>, sandwich2: Array<String>): Boolean {
    return sandwich1.first() == sandwich2.first() && sandwich1.last() == sandwich2.last()
}

fun main() {
    println(hasSameBread(arrayOf("white bread", "lettuce", "white bread"), arrayOf("white bread", "tomato", "white bread"))) // true
    println(hasSameBread(arrayOf("brown bread", "chicken", "brown bread"), arrayOf("white bread", "chicken", "white bread"))) // false
    println(hasSameBread(arrayOf("toast", "cheese", "toast"), arrayOf("brown bread", "cheese", "toast"))) // false
}
