fun MutableList<Int>.swap(x: Int, y: Int){
    val tmp = this[x]
    this[x] = this[y]
    this[y] = tmp


}

fun <T> MutableList<T>.swap2(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' はリストに対応する
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    var list = mutableListOf(1,2)
    println(list)
    list.swap(0,1)
    println(list)
}
