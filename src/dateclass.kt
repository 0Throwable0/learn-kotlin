data class User(val name: String, val age: Int)

fun main(args: Array<String>) {

    val jane  = User("jane ",35)
    val (name,age) = jane

    println("$name,$age years of age")
}
