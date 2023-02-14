// -> condicional anidada <-
// Algoritmo que reciba numeros enteros y validar las siguientes condiciones
// 1. Si el numero es positivo (n > 0), realizar operación para saber si el numero ingresado es par o impar e imprimir los numeros
// 2. Si el numero es negativo (n < 0) imprimir un mensaje = "El numero es negativo" y mostrar el numero 
// 3. Si el numero es cero (n = 0) imprimir un mensaje = "El numero es nulo"

// Solicitar un numero entero
print("Ingresar numero\n")
var n:Int = readln().toInt()

//Evaluar la condicion: n > 0 = par o impar | n < 0 numero negativo | n = 0 nulo
if (n > 0) {
    // almacenamos el resultado del modulo(%)
    val par = n % 2
    //Evaluamos la condición
    if (par == 0){
        //Si se cumple la condición imprimir que es par
        print("El numero $n es par")
    } else {
        //Si no se cumple la condición imprimir que es impar
        print("El numero $n es impar")
    }
// En caso de que no se cumpla la primera condición pasamos a evaluar la siguiente condición
} else if (n < 0){
    //Si se cumple la condición imprimir que es negativo
    print("El numero $n es negativo ")
} else if (n == 0) {
    //Si no se cumple la condición imprimir que es 
    print("El numero es nulo")
}