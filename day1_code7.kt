fun sayHello1(itemToGreet: String) {
    val msg = "Hello " + itemToGreet
    println(msg)
}

fun sayHello2(itemToGreet: String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}

fun sayHello3(itemToGreet: String) = println("Hello $itemToGreet")

fun sayHello4(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
   sayHello1("Universe")
   sayHello2("Multiverse")
}
