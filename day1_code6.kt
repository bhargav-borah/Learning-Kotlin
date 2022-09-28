// Basic functions

fun getGreeting(): String {
    return "Hey"
}

fun newGreeting(): String? {
    return null
}

// Unit return type basically means it returns nothing useful
fun sayHello(): Unit {
   println(getGreeting()) 
}	

// We can omit the type declaration of the function in the above case

// Just like variables, functions in Kotlin support type inference too
fun getGreeting2(): String = "Hello There"
fun getGretting3() = "hELLO aGaIn"


fun main() {
	println(getGreeting())   
	sayHello()	
}