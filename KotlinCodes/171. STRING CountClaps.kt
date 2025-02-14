fun countClaps(claps: String): Int {
    return claps.count { it == 'C' }
}

fun main() {
    println(countClaps("ClaClaClaClap!"))           // ➞ 4
    println(countClaps("ClClClaClaClaClap!"))       // ➞ 6
    println(countClaps("CCClaClClap!Clap!ClClClap!")) // ➞ 9
}
