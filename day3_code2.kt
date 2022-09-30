class Person(val firstName: String, val lastName: String) {
    
    init {
        println("init 1")
    }
    
    constructor(): this("Peter", "Parker") {
        println("secondary constructor")
    }
    
    init {
        println("init 2")
    }
}

fun main() {
    
    val person1 = Person("Bhargav", "Borah")
    val person2 = Person()
    
}