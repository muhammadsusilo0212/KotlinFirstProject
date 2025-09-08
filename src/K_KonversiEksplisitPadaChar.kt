fun main (args: Array<String>){
    var c:Char // Character
    var i:Int //adrinal (ASCII) value of the character

    c = 'a'
    i = c.toInt()
    println("The character $c was convertd to its ASCII value of $i")

    i=98
    c=i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}