// menu para loja virtual 

fun main(){
    println("Qual menu vc deseja acessar: 1,2,3 ou 4?")
    val opcao =  readLine()?.toIntOrNull()

    when(opcao){
        1-> println("Vc escolheu um samsung")
        2-> println("Vc escolheu um apple")
        3-> println("Vc escolheu um xiaome")
        4-> println("Vc escolheu um LG")
        else -> println("Opção invalida")

    }
}