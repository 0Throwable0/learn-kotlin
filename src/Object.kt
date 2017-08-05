interface Factory<T>{
    fun create(): T
}

class MyClass{
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}



fun main(args: Array<String>) {
    val instance = MyClass.create()
    val x = MyClass.Companion
}