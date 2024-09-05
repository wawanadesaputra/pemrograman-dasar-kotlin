fun main(args: Array<String>) {
    //Character occurence in a sentence analysis
    //The string that we want to analyze
    var s = "A programer gets stuck in the shower because the instruction on the shampoo were: Lather, Wash and Repeat."
    println(s)
    s = s.toLowerCase()

    //Countres initialization
    var vowelCount = 0
    var consonantCount = 0

    //Definition 0f character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    //main loop
    for (c in s){
        if(vowels.contains(s)) {
            vowelCount++
        }else if(consonants.contains(c)){
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonant: $consonantCount")
    println("Other character: ${s.length - (vowelCount + consonantCount)}")
}