fun main() {
    /**
     * let
     * Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
     * Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
     */
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

    /**
     * menjalankan fungsi lain jika objeknya null
     */
    val message1: String? = null
    message1?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    /**
     * also
     * Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
     * Namun untuk konteks objeknya tersedia sebagai argumen (it).
     * Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
     */
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}