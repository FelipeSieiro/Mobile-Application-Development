// Exemplo de Variaveis em Kotlin

// fun main() {

//     val nome = "Felipe" //variavel tipo string   - mutavel 
//     var idade = 19      //Variavel tipo inteira  - imutavel 

//     println("Ola, $nome! Voce tem $idade anos")                     //

// }

//DEClaração e Inicialização de Variaveis 
// Int, Double, String, Boolean

// fun main(){

//     val numeroInteiro: Int= 12
//     val numeroDecimal: Double = 12.4
//     val texto: String  = "Este é um Texto"
//     val verdadeiro: Boolean = true
//     val falso: Boolean = false


// println("Numero Inteiro: $numeroInteiro")
// println("Numero Decimal: $numeroDecimal")
// println("Texto: $texto")
// println("Verdadeiro ou Falso: $verdadeiro ou $falso")
// }

//Variaveis com tipos de Dados 
// Char, Byte, Short, Long

// fun main(){

//     val numeroInteiro:Int = 10
//     val numeroLong:Long = 100000000000000
//     val numeroChar:Char='A'
//     val numeroByte:Byte=12
//     val numeroShort:Short= 32765
//     val string: String = "Kotlin"

//     println("Inteiro : $numeroInteiro")
//     println("Long : $numeroLong")
//     println("Caractere : $numeroChar")
//     println("Byte : $numeroByte")
//     println("Short : $numeroShort")
//     println("String : $string")

//


//Mutabilidade e Imutabilidade no contexto var e val

// fun main(){
//     var mutavel :Int = 10
//     val imutavel : Int = 5

//     //mutavel = 15      //Ok
//     //imutavel = 23    //Erro pois é uma variável imutável. Não pode ser alterada após a atribuição do valor

//     println("Imutavel  : $imutavel")
//     println("Mutavel   : $mutavel")
// }


//Exemplo nomeclatura de  variáveis em Kotlin
// Utilizar sempre camelCase

// fun main(){
//     val nomeCompleto: String = "Felipe Sieiro"
//     val idadeUsuario : Int = 19
//     val valorTotal : Double = 59.3 //Evite usar underscore em nome de variaveis 

//     println("Nome Completo : $nomeCompleto")
//     println("Idade do Usuário : $idadeUsuario")
//     println("Valor Total : $valor_Total")
// }