fun main() {
//    val ranges = 1..5 step 2
//    for (i in ranges) {
//        println("value is $i!")
//    }

    /**
     * mengakses indeks range
     */
//    val ranges = 1..10 step 3
//    for ((index, value ) in ranges.withIndex()) {
//        println("value $value with index $index")
//    }

    /**
     * menggunakan for each
     */
    val ranges = 1..10 step 3
    ranges.forEach { value ->
        println("value is $value")
    }

    /**
     * mendapatkan index dengan foreach
     */
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

}