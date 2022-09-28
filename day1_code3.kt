fun main() {
    // Type declaration can be omitted
    val name = "Bhargav"
    
    // For variables which need to be nullible, having a type declaration is good practice
    val greeting: String? = "Hey"
    if (greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }
}