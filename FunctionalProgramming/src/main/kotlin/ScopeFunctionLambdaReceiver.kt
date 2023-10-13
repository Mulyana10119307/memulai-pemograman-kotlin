fun main() {
    /**
     * run
     * mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda
     * menggunakan receiver this
     */
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result: $result")

    /**
     * with
     * function biasa
     * Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver
     */
    val message = "Hello Kotlin"
    val  resultWith = with(message) {
        println("value is $this")
        println("with lenght ${this.length}")
    }
    println(resultWith)

    /**
     * apply
     * nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this)
     */
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(messageApply.toString())
}