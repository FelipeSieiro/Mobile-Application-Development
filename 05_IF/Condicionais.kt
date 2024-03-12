// Descobri se o usuário é maior ou menor de idade

// fun main(){
//     val idade = 11
//     if(idade >= 18){
//         println("Maior de idade")
//     }else{
//         println("Menor de idade")
//     }
// }

// ========================= Recebendo parametros do usuário=======================

fun main(){
    //solicitando ao usuario para digitar a sua idade 
    print("Digite a sua idade: ")
    val idadeInput = readLine() // le a entrada do user como um string


    //Verificar se a entrada da idade é nula 
    if(idadeInput == null){
        println ("Entrada  inválida")
        return //sai da função 
    }

    //tenta converter a entrada de idade para um valor numerico 
    val idade = idadeInput.toIntOrNull()

    if (idade == null) {
        println("Entrada inválida")
        return
    }


    //verifica se a idade é maior ou iguala a 18

    if(idade >= 18){
        println("Maior de idade")
    }else{
        println("Menor de idade")
    }

}