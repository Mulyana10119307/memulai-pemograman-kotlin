fun main() {
    printResult(10, sum)
    printResult(10) { value ->
        value + value
    }
}

/**
 * H-O Function
 * sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
 */
var sum: (Int) -> Int = { value -> value + value}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

/**
 * inline function
 */
inline fun printResult1(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}