fun countDs(sentence: String): Int {
    return sentence.count { it.equals('d', ignoreCase = true) }
}

fun main() {
    println(countDs("My friend Dylan got distracted in school."))   // ➞ 4
    println(countDs("Debris was scattered all over the yard."))     // ➞ 3
    println(countDs("The rodents hibernated in their den."))        // ➞ 3
}
