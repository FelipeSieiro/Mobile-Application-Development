fun main(){
    var valorCoxinha : Double  = 5.0
    var valorCerveja : Double  = 15.0
    var quatidadeCoxinha: Int = 3
    var quatidadeCerveja: Int = 2

    var somaCoxinha : Double = valorCoxinha*quatidadeCoxinha 
    var somaCerveja : Double = valorCerveja*quatidadeCerveja

    var total : Double = somaCerveja + somaCoxinha 

    var taxa : Double =  total * 0.10 
    var valorCobrado : Double = total + taxa


    println("----------------------")
    println(" Lanchonete do Felipe ")
    println("----------------------")
    println(" $quatidadeCoxinha Coxinhas:     R$ $somaCoxinha")
    println(" $quatidadeCerveja Cervejas:     R$ $somaCerveja")
    println(" Total a Pagar:  R$ $total")
    println(" TAXA:           R$ $taxa")
    println("----------------------")
    println("Conta Final:     R$ $valorCobrado")







    








}





