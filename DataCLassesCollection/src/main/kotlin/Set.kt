fun main() {
    /**
     * Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
     * ketika Anda menginginkan tidak ada data yang sama atau duplikasi
     */
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    /**
     * in
     * pengecekan sebuah nilai dalam set
     */
    println("5 ada didalam set? ${5 in integerSet} ")

    /**
     * union
     * mengetahui gabungan
     * intersect
     * mengetahui irisan
     * dari 2 buah set
     */
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    println(setA == setB)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    println("union setA dan setC : $union")

    val intersect = setA.intersect(setC)
    println("intersect setA dan setC : $intersect")

    /**
     * mutableSetOf()
     * bisa menambah dan menghapus
     * tidak bisa mengubah
     */
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//    mutableSet[2] = 6 //error
    mutableSet.add(6) //menambah item di akhir
    mutableSet.remove(1) // menghapus item yang memiliki nilai 1
    println(mutableSet)
}