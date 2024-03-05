// Exercicio 1: Soma dos elementos 

fun main(){
    val numbers = intArrayOf(5, 10, 15, 20, 25)
    var sum = 0

    for (number in numbers){
        sum += number
    }

    println("A soma é $sum")
}