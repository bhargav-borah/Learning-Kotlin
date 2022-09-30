class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
    
    var nickName: String? = null
    	set(value) {
            field = value
            println("The nickname has been updated to $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }
        
    // Defining a method
    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
    
}

fun main() {
   val person1 = Person()
   person1.nickName = "Spidey"
   person1.nickName = "Spiderman"
    
   println(person1.nickName)
   
   person1.printInfo()
}

// Classes in Kotlin are public by default

/*

public Class ClassName {

}

/*

'internal' keyword specifies that the class is public within the module in which it is defined
internal Class ClassName {

}

/*

/*

'private' keyword specifies that the class can't be accessed

private Class ClassName {

}

/*

// The aforementioned keywords can be used for properties and methods within the class body
// 'protected' keyword when applied to a keyword or a property means that it can be accessed only within the class body or any subclasses


