class Player(
    private val name: String,
    private val age: Int,
    private val height: Int,
    private val weight: Int
) {
    fun getAge(): String {
        return "$name is age $age"
    }

    fun getHeight(): String {
        return "$name is ${height}cm"
    }

    fun getWeight(): String {
        return "$name weighs ${weight}kg"
    }
}

fun main() {
    val p1 = Player("David Jones", 25, 175, 75)

    println(p1.getAge())      // ➞ "David Jones is age 25"
    println(p1.getHeight())   // ➞ "David Jones is 175cm"
    println(p1.getWeight())    // ➞ "David Jones weighs 75kg"
}
