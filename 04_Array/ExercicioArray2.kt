//Exercicio 2: Maior e menor Elementos 


fun main(){
    val numbers = intArrayOf(8, 3,12,6,20)
    var max = numbers[0]
    var min = numbers[0]


    //Loop para encontar o maior e menor elemento

    for(number in numbers){
        if(number < min){
            min = number
        }
        if(number > max){
            max = number
        }
    }

    println("O menor elemento é : $min")
    println("O menor elemento é : $max")
}
