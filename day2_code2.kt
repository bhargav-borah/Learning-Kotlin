fun main() {
   val collection1 = listOf("Kotlin", "Programming", "Language")
   println(collection1[1])
   println(collection1.get(1))
   
   collection1.forEach { item ->
       println(item)
   }
   
   collection1.forEachIndexed { index, item ->
       println("$index $item")
   }
   
   val map1 = mapOf(1 to "a", 2 to "b", 3 to "c")
   map1.forEach { key, value -> println("$key: $value")}
   
   // Collections in Kotlin are immutable by default
  
   val collection2 = mutableListOf("Kotlin", "Programming", "Language")
   collection2.add("dsdsdsd")
   
   val map2 = MutableMapOf(1 to "a", 2 to "b", 3 to "c")
   map2.put(4 to "d")
   
}