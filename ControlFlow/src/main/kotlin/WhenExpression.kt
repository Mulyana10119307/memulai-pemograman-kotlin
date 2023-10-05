fun main() {
//    val value = 20
//
//    when(value) {
//        6 -> println("value is 6")
//        7 -> println("value is 7")
//        8 -> println("value is 8")
//        else -> println("value cannot be reached")
//    }

    /**
     * disimpan kedalam sebuah variable
     */
//    val value = 7
//    val stringOfValue = when (value) {
//        6 -> "value is 6"
//        7 -> "value is 7"
//        8 -> "value is 8"
//        else -> "value cannot be reached"
//    }
//    println(stringOfValue)

    /**
     * ketika >2 baris kode
     * gunakan {}
     */
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("endefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    /**
     * mengetahui tipe data dengan when
     * is & !is
     */
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long Type")
        is String -> println("the value has a String")
        else -> println("undefined")
    }
}