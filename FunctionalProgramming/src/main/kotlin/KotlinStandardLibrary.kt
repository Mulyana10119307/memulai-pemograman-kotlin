fun main() {
    /**
     * lambda argument (it)
     */
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    text.let { value ->
        val pesan = "$value Kotlin"
        println(pesan)
    }
}

/**
 * let, run, with, apply, dan also.
 * Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode dari dalam sebuah objek.
 */

/**
 * lambda receiver (this)
 */
val buildString = StringBuilder().apply {
    append("Hello")
    append("This")
}

