fun main(args: Array<String>) {
    val strings = listOf("ccccc", "bbbb", "ddd", "aaaaa", "eeeee")
    val result = strings.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() }
    println(result)
}