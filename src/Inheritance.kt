fun main(args: Array<String>) {
    val der = Derived()
    der.v()

    val c = C()

    c.f()
    c.a()
    c.b()


}

open class Base {

    open fun v() {}
    open fun vv() {}
    protected fun vn() {}


}

class Derived : Base() {
    override fun v() {}
    final override fun vv() {}

}

open class Foo {
    open val x: Int get() {
        return 1
    }
}

class Bar1(override val x: Int) : Foo() {

}

open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }
}

interface B {
    fun f() {
        println("B")
    }

    fun b() {
        println("b")
    }

}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }

}

open class Base2 {
    open fun f() {}
}

abstract class Drived : Base2() {
    override abstract fun f()

}
