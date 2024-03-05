// Exercicio 4; Buscando elementos do array 

fun main(){
//Array strings 
val names = arrayOf("Mariana", "Beatriz", "Kaue", "Lucas")
val searchName = "Kaue" // elemento a ser buscado 
var found = false // variavel para verificar se o elemento foi encontrado 

//Loop para verificar se o elemento está presente

for(name in names){
    if(name == searchName){
        found = true
        break 
    }
}
if (found){
    println("$searchName foi encontrado o array.")
} else{
    println("$searchName não foi encontrado no array.s")
}





}