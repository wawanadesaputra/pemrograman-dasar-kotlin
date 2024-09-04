fun main(args: Array<String>) {
    //ASCII value
    var c: Char //Character
    var i: Int //Ardinal (ASCII) value of the character
    //Conversion from text to ASCII value

    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

    //Conversion form an ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to it's textual valie of $c")
}