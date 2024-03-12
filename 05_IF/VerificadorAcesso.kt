// Exercicio verificador de acessos 
// recebe dados do user
 fun main(){
    print("Digite a seu user: ")
    val user = readLine()
    print("Digete sua senha: ")
    val senha = readLine()


    val userCorreta = "FelipeSieiro"
    val senhaCorreta ="123"
     //verificando se user é valido
     if(user == userCorreta && senha  == senhaCorreta){
         println("Acesso permitido!")
     }else{
        println("Usuário ou Senha inválidos.")
     }


 }