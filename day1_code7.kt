fun sayHello1(itemToGreet: String) {
    val msg = "Hello " + itemToGreet
    println(msg)
}

fun sayHello2(itemToGreet: String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}

fun main() {
   sayHello1("Universe")
   sayHello2("Multiverse")
}