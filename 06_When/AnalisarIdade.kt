// analisando a idade com when

fun main(){
    var idade = 17
    when{
        idade < 0 -> println("Idade não pode ser negativa")
        idade == 0 -> println("Você é um ser superior!")
        else -> {
            if (idade <= 12) {
                println("Menino")
            }else if(idade <= 18){
                println("Adolescente")  
            }else{
                println("Homem")
            }
        }
}}