// -> while <-
// Algoritmo que solicite un numero n donde n debe ser multiplicado del 1 al 10 y imprimirlo en consola
// Ejemplo:  n = 5
//           5 * 1 = 5
//           5 * 2 = 10
//           5 * 3 = 15
//              ...

// Solicitar el numero n y almacenarlo en una variable
print("Ingresar numero\n")
var n:Int = readln().toInt()
// Creamos un contador para mantener el control del ciclo
var cont:Int = 1

// Hacemos que el ciclo se repita 10 veces
while (cont <= 10){
    //Realizamos la operación
    val result:Int = n * cont
    //Imprimis el resultado de l
    println("$n x $cont = $result")
    //Aumentamos el contador de uno en uno hasta llegar a 10 para poder finalizar el ciclo
    cont++
}
