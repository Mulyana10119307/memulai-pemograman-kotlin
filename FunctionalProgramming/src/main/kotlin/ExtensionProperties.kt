fun main() {
    println(10.slice)

    val value: Int? = null
    println(value.bagi)
}

val Int.slice: Int
    get() = this / 2

/**
 * Nullable Receiver
 */
val Int?.bagi: Int
    get() = this?.div(2) ?:0
