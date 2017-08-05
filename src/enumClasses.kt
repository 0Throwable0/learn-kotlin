enum class Direction{
    NORTH,SOUTH,WEST,EAST
}

enum class  Coloer(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState{
    WAITING{
        override fun signal() = TALKING

    },
    TALKING{
        override fun signal() = WAITING

    };
    abstract fun signal(): ProtocolState
}


fun main(args: Array<String>) {
    val direction = Direction.EAST

    println(direction)

    val color = Coloer.RED
    println(color.rgb)

    val color1 = Coloer.GREEN
    println(color1.rgb)

    val color2 = Coloer.BLUE
    println(color2.rgb)

    val blue = Coloer.valueOf("BLUE")
    println(blue.rgb)

    for(color in Coloer.values()){
        println(color)
    }


}