fun main(args: Array<String>) {
    //Split() and joinToString()
    //Morse code decoder
    //The String which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    //The String with the decode message
    var message = ""

    //Array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-,--", "--..")

    //Splitting the String into morse characters
    val characters = s.split(" ")

    //Itterating over morse characters
    for (morseChar in characters){
        val index = morseChars.indexOf(morseChar)
        //Character was found
        if(index != -1){
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}