fun toScottishScreaming(str: String): String {
    // Replace every vowel ('a', 'e', 'i', 'o', 'u') with 'e' and convert to uppercase.
    return str.replace(Regex("[aeiouAEIOU]"), "e").toUpperCase()
}

fun main() {
    // Example 1: Replace vowels with 'e' and convert to uppercase
    println(toScottishScreaming("hello world"))
    // Output: "HELLE WERLD"

    // Example 2: Replace vowels with 'e' and convert to uppercase
    println(toScottishScreaming("Mr. Fox was very naughty"))
    // Output: "MR. FEX WES VERY NEEGHTY"

    // Example 3: Replace vowels with 'e' and convert to uppercase
    println(toScottishScreaming("Butterflies are beautiful!"))
    // Output: "BETTERFLEES ERE BEEETEFEL!"
}
