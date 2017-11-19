fun main(args: Array<String>) {
    println("Bitte gib ein Text ein:")
    val textIn:String = readLine().toString()
    println(textIn + " hat soviel Zeichen:")
    println(textIn.length)
}