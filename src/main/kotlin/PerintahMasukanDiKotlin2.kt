fun main(args: Array<String>) {
    //Double program panjang
    println("Enter a number and I.ll double it: ")
    val input = readLine()!!
    var a = input.toInt() //Eventually double
    a = a * 2
    println(a)

    println("Enter a number, and I'll square it: ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}