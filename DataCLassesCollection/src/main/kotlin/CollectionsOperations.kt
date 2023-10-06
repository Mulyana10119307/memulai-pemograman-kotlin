fun main() {
    /**
     * filter() dan filterNot()
     * untuk mem-filter atau menyaring suatu data dalam sebuah collection.
     */
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEventList)

    /**
     * map()
     * Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya
     * it pada kode di bawah akan merepresentasikan masing masing item pada numberList
     */
    val multipliedBy5 = numberList.map { it * 5 }
    println("map() : $multipliedBy5")

    /**
     * count()
     * untuk menghitung jumlah item yang ada di dalam collection.
     * menambahkan sebuah parameter berupa lambda yang berisi sebuah kondisi
     */
    println("count() : ${numberList.count()}")
    println("count() with parameter : ${numberList.count { it % 3 == 0 }}")

    /**
     * find()
     * Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan
     * firstOrNull() , lastOrNull()
     */
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.find { it % 2 == 3 }

    /**
     * first() , last()
     * menyaring item pertama atau terakhir dari sebuah collection.
     */
    val moreThan9 = numberList.first { it > 9 }
    println(moreThan9)

    /**
     * sum()
     * Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
     */
    val total = numberList.sum()
    println(total)

    /**
     * sorted()
     * digunakan untuk mengurutkan item yang ada di dalam collection.
     * deafult secara ascending
     */
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()
    
    println(ascendingSort)
    println(descendingSort)
}