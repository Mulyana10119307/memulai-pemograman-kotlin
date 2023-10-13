fun main() {
    /**
     * chuncked()
     * fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array
     */
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}