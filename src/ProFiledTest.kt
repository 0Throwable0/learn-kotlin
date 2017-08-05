class Time(var hour: Int, var minute: Int) {
    override fun toString() = "$hour:$minute"

    /*
    var stringRepresentation: String
        get() = toString()
        set(value) {
            setDataFromString(value)

        }

    fun setDataFromString(value: String) {

        val list = value.split(":")
        hour = list[0].toInt()
        minute = list[1].toInt()
    }
    */
}
var Time.stringRepresentation: String
    get() = toString()
    set(value){
        val list = value.split(":")
        hour = list[0].toInt()
        minute = list[1].toInt()
    }


fun main(args: Array<String>) {
    val time = Time(22, 30)
    println(time.stringRepresentation)

    time.stringRepresentation = "12:20"
    println(time.stringRepresentation)

    val test = Test()
    test.counter = 3

    println(test.counter)

    val hoge = Hoge()
    hoge.text = "Hello"
    println(hoge.text)

}

class Test {
    var counter = 0
        set(value) {
            if (value >= 0)
                field = value
        }
}

class Hoge {
    var text: String = ""
        set(value) {
            field = value.toLowerCase()
        }
}
