fun main() {
    val greeting: String? = "Hello"
    
    // "when" is similar to "switch" in Java
    when(greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
}
