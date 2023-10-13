fun main() {
    /**
     * membuat instance dengan lambda
     */
    val sum: Arithmetic = {valueA, valueB -> valueA + valueB}
    val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

    val jumlah: Penjumlahan = {valueA, valueB -> valueA + valueB}

    /**
     * menggunakan instance
     * invoke()
     */
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply(20, 20)

    val hasilJumlah = jumlah?.invoke(10, 20)

    println("Sum Result : $sumResult")
    println("Multiply Result : $multiplyResult")
    println("Hasil Jumlah : $hasilJumlah")
}

/**
 * membuat function menjadi tpe data
 */
typealias Arithmetic = (Int, Int) -> Int

/**
 * menandai function type dengan nullable
 */
typealias Penjumlahan = ((Int, Int) -> Int)?