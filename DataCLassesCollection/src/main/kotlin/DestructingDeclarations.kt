fun main() {
    val dataUser = DataUser("Mulyana", 24)
    val dataUser2 = DataUser("Asep", 12)

    /**
     * componentN() -> komponen ke-N
     * proses memetakan objek menjadi sebuah variabel
     */
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")

    /**
     * Cara kedua
     */
    val (nama, umur) = dataUser2
    println("My name is $nama, I am $umur years old")

    /**
     * mengakses method di class data
     */
    val dataUser3 = DataUser("nrohmen", 33)
    dataUser3.intro()
}