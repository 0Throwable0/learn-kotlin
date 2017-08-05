fun main(args: Array<String>) {

    var a = 100
    var max: Int

    if (a < 120)
        max = 120
    else
        max = a

    println(max)

    val max2 = if (a > 130) a else 130

    println(max2)
}
