fun main() {
    /**
     * Map
     * collection yang menyimpan key-value
     */
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "English",
        "New Delhi" to "India"
    )

    /**
     * mendapatkan value dengan key
     */
    println(capital["Jakarta"])

    /**
     * menggunakan getValue()
     */
    println(capital.getValue("Jakarta"))

    /**
     * menampilkan key di Map
     * keys
     */
    val mapKeys = capital.keys
    println(mapKeys)

    /**
     * menampilkan nilai di Map
     * values
     */
    val mapValues = capital.values
    println(mapValues)

    /**
     * untuk menambahkan key-value ke Map ubah menjadi mutableMap
     * atau buat mutableMap dari awal
     * namun, tidak disarankan menggunakan mutableMap
     */
    val mutableCapital = capital.toMutableMap()
    /**
     * put()
     * menambahkan key-value
     */
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital["Berlin"] = "Germany"

    println("Mutable Map : $mutableCapital")
}