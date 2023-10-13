fun main() {
    10.printInt()
    println(10.plusThree())
}

fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree() : Int {
    return this + 3
}