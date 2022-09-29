fun sayHello(greeting:String, vararg itemsToBeGreeted:String) {
    itemsToBeGreeted.forEach { itemToBeGreeted -> 
    	println("$greeting $itemToBeGreeted")
    }
}

fun greetPerson(greeting:String = "Hello", name:String = "Bot") = println("$greeting $name")

fun main() {
   val collection1 = arrayOf("Kotlin", "Programming", "Language")
   // sayHello("Hi", collection1) returns error as string was expected, not array
   sayHello("Hi", *collection1) // "*" is the spread operator
   
   greetPerson("Hi", "Bhargav")
   
   // Named arguments
   greetPerson(name = "Bagga", greeting = "Hello")
   
   greetPerson(name = "Bugs")
   
   greetPerson()
   
   // Error, the vararg arguments should also be referenced
   // sayHello(greeting = "Hey", *itemsToBeGreeted)
   
   sayHello(greeting = "Hey", itemsToBeGreeted = *collection1)
               
}