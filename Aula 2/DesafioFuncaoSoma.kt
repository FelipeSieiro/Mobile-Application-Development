//Desafio soma de Dois Quadrados

fun somaDosQuadrados(a: Int, b:Int): Int{
    val quadradoA = a * a

    //Retorna a soma dos Quadrados de 'a' e 'b'
    val quadradoB = b * b

    //Retorna a soma dos quadrados de  'quadradoA' e 'quadradoB'
    return quadradoA + quadradoB
}

fun main(){
    val a = 3 // valor de a
    val b = 4 // valor de b
    val resultado =  somaDosQuadrados(a, b) //chama função com os valores de a e b
    
    println("O resultado da soma dos quadrados de $a e $b é ${resultado}")//imprime o resultado
}