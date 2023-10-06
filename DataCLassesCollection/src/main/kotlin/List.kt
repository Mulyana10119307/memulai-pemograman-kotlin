fun main() {
    /**
     * Dengan List kita dapat menyimpan banyak data menjadi satu objek.
     * List bersifat immutable alias tidak bisa diubah
     */
    val numberList : List<Int> = listOf(1,2,3,4,5)
    val numberList2 = listOf(6,7,8,9,10)
    var charList = listOf('a', 'b', 'c')

    /**
     * mix list
     */
    val anyList = listOf('a', "Kotlin", 3, true)

    /**
     * memasukan data class kedalam list
     */
    val mixList = listOf('a', "Kotlin", 3, true, User("Mulyana"))

    /**
     * mengakses list menggunakan indexing
     */
    println(mixList[3])
    println(mixList[4])

    /**
     * mengakses index diluar ukurannya
     * error index array out of bounds
     */
//    println(mixList[5])

    /**
     * mutableListOf()
     * jika ingin mengubah nilai didalamnya
     */
    val mixList1 = mutableListOf('a', "Kotlin", 3, true, User("Mutable"))

    mixList1.add('d') //menambah item di akhir list
    mixList1.add(1, "love") //menambah item pada indeks ke-1
    mixList1[3] = false //mengubah nilai item indeks ke-3
    mixList1.removeAt(0) //menghapus item pada indeks ke-0

    println(mixList1)
}

data class User(
    val name: String
)