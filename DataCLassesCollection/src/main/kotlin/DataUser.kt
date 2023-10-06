data class DataUser(
    val name: String,
    val age: Int
) {
    /**
     * menambahkan function atau method di class data
     */
    fun intro() {
        println("$name, ini adalah function didalam class data")
    }
}

fun main() {
    val user = DataUser("Mulyana", 24)
    println(user)

    /**
     * copy()
     * menyalin sebuah objek
     */
    val user2 = DataUser("Asep", 12)
    val user3 = DataUser("Ujang", 22)
    val user4 = user.copy()
    println("Data Copy dari User : $user4")

    /**
     * mengubah salah satu parameternya
     */
    val user5 = user2.copy(age = 23)
    println("Mengubah age user2 : $user5")

}