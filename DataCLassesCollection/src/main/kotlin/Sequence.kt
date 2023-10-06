fun main() {
    /**
     * Sequence
     * lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan
     * asSequence()
     * Untuk menerapkan lazy  atau vertical evaluation maka kita perlu mengubah list menjadi Sequence
     */
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}