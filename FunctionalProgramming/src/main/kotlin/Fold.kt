fun main() {
    /**
     * Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk perhitungan dan lambda expression yang nilai kembaliannya digunakan untuk menentukan nilai awal selanjutnya
     */
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    /**
     * foldRight()
     */
    val foldRight = numbers.foldRight(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold Right Result : $foldRight")

}