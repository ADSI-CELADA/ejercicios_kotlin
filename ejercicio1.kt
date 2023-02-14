// 1. -> Condicional simple <-
// Algoritmo que solicite 3 numeros distintos e imprima un mensaje cuando el primer numero y el tercero sean mayores
// al segundo
// */

// Solicitar los 3 numeros y almacenarlos en una variable

// Petición del primer numero
var n1:Int = readln().toInt()
// Petición del segundo numero
var n2:Int = readln().toInt()
// Petición del tercer numero
var n3:Int = readln().toInt()

// Evaluar la condición n1 > n2 y n3 > n2
if (n1 > n2 && n3 > n2){
    //Imprimimos por consola
    print("$n1 y $n3 son mayores a $n2")
}

