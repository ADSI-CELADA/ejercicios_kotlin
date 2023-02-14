// -> ciclo for <-
// Algoritmo que permita mostrar los números múltiplos de tres, cinco y siete y la cantidad de cada multiplo, entre los números del 1 al 100

// -> ciclo for <-
// Algoritmo que permita mostrar los números múltiplos de tres, cinco y siete y la cantidad de
// cada multiplo, entre los números del 1 al 100

//Creamos las variables donde almacenaremos la cantidad de los multiplos a su correspondiente numero
var num1:Int = 0
var num2:Int = 0
var num3:Int = 0

//Creamos el ciclo y que este se repita en un rango de uno a cien
for (i in 1..100) {
    //Evaluar condición para saber los multiplos de 3
    if (i % 3 == 0) {
        //Aumentamos su contador para sabar la cantidad de multiplos del numero 3
        num1++
    }

    //Evaluar condición para saber los multiplos de 5
    if (i % 5 == 0) {
        //Aumentamos su contador para sabar la cantidad de multiplos del numero 5
        num2++
    }

    //Evaluar condición para saber los multiplos de 7
    if (i % 7 == 0){
        //Aumentamos su contador para sabar la cantidad de multiplos del numero 7
        num3++
    }
    //Imprimimos los numeros del 1 al 100
    println(i)
}

//Imprimimos los resultado de las cantidades de cada multiplo
print("Multiplos de 3 -> $num1\n")
print("Multiplos de 5 -> $num2\n")
print("Multiplos de 7 -> $num3\n")