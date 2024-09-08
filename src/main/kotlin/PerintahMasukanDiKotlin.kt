fun main(args: Array<String>) {
    println("Hi, I'm Wawan, the virtual parrot, and I love to repeat!")
    println("Type something in: ")
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}