fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)
}

/**
 * vararg
 * adalah sebuah array
 * Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan
 * jumlah argumen yang kita masukkan ketika fungsi tersebut dipanggil
 */
fun sumNumbers(vararg number: Int) = number.sum()