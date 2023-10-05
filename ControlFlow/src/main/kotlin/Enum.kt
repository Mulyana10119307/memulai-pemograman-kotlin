fun main() {
    /**
     * Konsep dari Enumeration sendiri sama seperti Array
     */

    /**
     * mengambil objek enum
     */
//    val colors: Array<Color> = Color.entries.toTypedArray()
//    colors.forEach { color ->
//        println("$color ")
//    }

    /**
     * valueOf()
     */
//    val color: Color = Color.valueOf("RED")
//    println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")

    /**
     * enumValues() dan enumValueOf()
     */
//    val colors: Array<Color> = enumValues()
//    colors.forEach { color ->
//        println(color)
//    }

//    val color: Color = enumValueOf("RED")
//    println("Color is $color")

    /**
     * mendapatkan posisi dari enum
     * ordinal
     */
//    val color: Color = Color.GREEN
//    println("Position GREEN is ${color.ordinal}")

    /**
     * mengecek isntance enum
     */
    val color: Color = Color.GREEN

    when(color) {
        Color.RED -> print("Color is RED")
        Color.BLUE -> print("Color is BLUE")
        Color.GREEN -> print("Color is GREEN")
    }
}

enum class Color(val value: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}