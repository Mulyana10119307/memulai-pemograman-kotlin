fun main() {
    val openOffice = 7
    val now = 8

    /**
     * if sebagai statement
     * karena tidak mengembalikan nilai
     */
    if (now > openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }

    /**
     * if sebagai expression
     * mengembalikan nilai dan memasukannya kedalam variable
     */
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)
}