fun main(args: Array<String>) {
    val text = """
    >Tell me and I forget.
    >Teach me and I remember.
    >Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin(">")

    println(text)

    val i = 10
    val s = "i = $i" // "i = 10"と評価され

    println(s)

    val d = "abc"
    val str = "$d.length is ${d.length}"

    println(str)

    val price = """
            |${'$'}9.99
        """.trimMargin()
    println(price)

}
