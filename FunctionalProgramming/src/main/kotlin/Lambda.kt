fun main() {
    message()
    message1("Ini lambda dengan parameter")
    val length = messageLength("Ini lambda dengan mengembalikan nilai")
    println(length)
}

/**
 * lambda tanpa parameter
 */
val message = {
    println("Ini lambda tanpa parameter")
}

/**
 * lambda dengan parameter
 */
val message1 = {
    message: String -> println(message)
}

/**
 * lambda mengembalikan nilai
 */
val messageLength = {
    message: String -> message.length
}
