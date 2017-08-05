class Outer{
    private val bar: Int = 1

    class Nested{
        fun foo() = 2
    }
}
class Outer2{
    private val bar: Int = 1
    inner class Inner{
        fun foo() = bar
    }
}
fun main(args: Array<String>) {
    val demo = Outer.Nested().foo()
    println(demo)

    val demo2 = Outer2().Inner().foo()
    println(demo2)


}
