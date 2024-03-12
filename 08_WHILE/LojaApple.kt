// usrr digitar oq deseja comprar 

fun main(){
    var opcao : Int
    println("Digite a opção de compra:")
    print("1 - Comprar livro\n2 - Comprar DVD\n3 - Comprar jogo eletrônico")
    opcao = readLine()?.get(0)?.toUpperCase() ?: ' '
    when (opcao) {
        in '1'..'9' -> println("Você digitou $opcao, por isso vamos comprar  um livro.")
        1 -> println("Você escolheu comprar um livro.")
        2 -> println("Você escolheu comprar um DVD.")
        3 -> println("Você escolheu comprar um jogo eletrônico.")
        else -> println("Opção inválida! Tente novamente.")
    }
}
}