// Classes in Kotlin

/*

Basic syntax of class

class Person {
    
}
*/

/*
We can omit the "constructor" keyword in here

class Person constructor(_firstName: String, _lastName: String) {
    
}
*/

class Person(_firstName: String, _lastName: String) {
    val firstName = _firstName
    val lastName = _lastName
    
    /*
              OR WE CAN DO THIS....
    val firstName: String
    val lastName: String
    
    init {
        firstName = _firstName
        lastName = _lastName
    }
    */
}

fun main() {
    val person1 = Person("Bhargav", "Borah")
    println(person1.firstName)
    println(person1.lastName)
}