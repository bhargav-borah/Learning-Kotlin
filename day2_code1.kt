// Collections and Iterations

fun main() {
   val arr = arrayOf("Kotlin", "Programming", "Language")
   println(arr.size)
   println(arr[0])
   println(arr.get(0))
   
   for (item in arr) {
       println(item)
   }
   
   println()
   
   arr.forEach {
       // it is the default name denoting each item in the array
       println(it)
   }
   
   println()
   
   arr.forEach { item ->
       println(item)
   }
   
   println()
   
   arr.forEachIndexed { index, item ->
       println("$index $item")
   }
}