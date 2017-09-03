fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3)
    val doubled = ints.map { it -> it * 2 }

    println(doubled)
}
