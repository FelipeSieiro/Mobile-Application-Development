// Exercicio 3: Média dos elmentos 

fun main(){

    val  values = doubleArrayOf(12.5, 9.8, 15.2, 18.2, 20.0)// array de doubles 
    var sum = 0.0 // variaveis para armazenar a soma 

    //Loop para somar os elmentos de array

    for(value in values){
        sum += value
    }

    val media = sum/values.size //caulculo da média
    println("A média : $media") // impressão da média 




}