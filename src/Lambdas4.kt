class HTML {
    fun body() {
        println("body")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // レシーバオブジェクトを生成
    html.init()        // そのレシーバオブジェクトをラムダに渡す
    return html
}


fun main(args: Array<String>) {
    html {       // レシーバ付きラムダがここから始まる
        body()   // レシーバオブジェクトのメソッドを呼んでいる
    }

}