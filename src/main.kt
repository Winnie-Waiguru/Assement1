fun main(){
    combine("CodeHive")

    var answer=modulus(10, 6)
    println(answer)


    var sentence=statement("Wangari", 50)
    println(sentence)

    var counting=long("I am a woman")
    println(counting)
}

fun modulus(num1: Int, num2:Int): Int{
    var answer= num1 % num2
    return answer


}

fun combine(program:String){
    println(program[4].toString()+program[5]+ program[6]+program[7])
}

fun statement(p:String, z: Int): String{

    var sentence = "Hi my name is $p and I am $z years old"
    return sentence
}

fun long(line:String): Int{
    var counting= line.length
    return counting

}

