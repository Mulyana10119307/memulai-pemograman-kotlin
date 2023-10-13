fun main() {
    println(evenNumbers)

    var message = "Kotlin"

    println(::message.name)
    println(::message.get())

//    ::message.set("Kotlin Academy")
    println(::message.get())
}

/**
 * memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikannya langsung sebagai instance dari function type
 */
val sum2: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

/**
 * function references
 * Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type
 */
val numbers = 1..10
val evenNumbers = numbers.filter(::isEvenNumber)

fun isEvenNumber(number: Int) = number % 2 == 0

/**
 * Property References
 * mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi setter getter, dll.
 */
