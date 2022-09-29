fun sayHello1(greeting:String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet -> 
    	println("$greeting $itemToGreet")
    }
}

fun sayHello2(greeting:String, vararg itemsToGreet:String) {
	itemsToGreet.forEach { itemToGreet -> 
    	println("$greeting $itemToGreet")
    }
}

fun main() {
   val items = listOf("World", "Universe", "Multiverse")
   sayHello1("Hello", items)
   
   sayHello2("HI", "Kotlin", "Programming", "Language")
   
   sayHello2("Hi") // Doesn't print anything
}