import kotlin.random.Random

fun main() {
    /**
     * Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo()
     */
//    val rangeInt = 1..10
//    println(rangeInt.step)

    /**
     * mengubah nilai dari step
     */
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
//    println(rangeInt.step)
    println()

    val tenToOne = 10 downTo 1
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    /**
     * Range with when
     */
    val value = 27
    val ranges = 10..50

    when(value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    /**
     * menangakap subjek dari when
     */
    val registerNumber = when(val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

}

fun getRegisterNumber() = Random.nextInt(100)