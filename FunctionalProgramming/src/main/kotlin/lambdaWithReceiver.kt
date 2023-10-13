fun main() {
    val message = buildString {
        append("Hello")
        append("From")
        append("DSL")
    }

    println(message)
}

/**
 * tanpa menggunakan konsep DSL
 */
fun buildString1(): String {
    val stringBuilder = StringBuilder()

    stringBuilder.append("Hello")
    stringBuilder.append("From")
    stringBuilder.append("Lambda")

    return stringBuilder.toString()
}

/**
 * menggunakan konsep DSL
 */
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}