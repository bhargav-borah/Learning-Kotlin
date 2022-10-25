var greeting: String? = "Hello"

fun main() {
	
    var greetingToPrint1 = if(greeting != null) greeting else "Hey"
    println(greetingToPrint1)
    
    var greetingToPrint2 = when(greeting) {
        null -> "Hey"
        else -> greeting
    }
}
