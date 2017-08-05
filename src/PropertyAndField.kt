fun main(args: Array<String>) {

    var address = Address()

    address.name = "11111"
    address.street = "22222"

    address = copyAddress(address)

    println(address.name)
    println(address.street)
    println(address.city)

    val myList = MyList(listOf("a", "b", "c"))
    println(myList.isEmpty)

    val emptyList = MyList(listOf())
    println(emptyList.isEmpty)


    var number = Number(1)
    println(number.stringRepresentation)

    number.stringRepresentation = "2"
    println(number.stringRepresentation)


}

class Address {
    var name: String = "sasaki"
    var street: String = "aaaaa"
    var city: String = "bbbbb"
    var state: String? = "ccccc"
    var zip: String = "123-3456"


}

fun copyAddress(address: Address): Address {
    val result = Address()

    result.name = address.name
    result.street = address.street

    return result
}


class MyList(val list: List<String>) {

    val isEmpty: Boolean
        get() = list.size == 0
}

class Number(var value: Int) {

    override fun toString() = value.toString()

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value)
        }

    fun setDataFromString(value: String) {
        this.value = value.toInt()
    }

}
