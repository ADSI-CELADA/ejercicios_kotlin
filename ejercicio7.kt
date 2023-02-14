// -> do while <-
// Algoritmo que de un numero al azar del 1 al 10 (función random()), donde el
// usuario tratara de adivinar el numero bajo la siguientes condiciones:
//1. Si lo adivina terminara el juego
// 2. Si no lo adivina repetir el proceso hasta que lo adivine

// Creamos una función para ejecutar el juego
fun game(){

    // Creamos la estructura ciclica do while para hacer que repita mientras una condición se cumpla o incluso que se ejecute a lo menos una vez
    do {
        //Pedimos el numero a adivinar y lo almacenamos en una variable
        print("Ingresa un numero\n")
        val num:Int = readln().toInt()
        // Creamos el rango en donde estara el numero a adivinar (1, 10)
        val nums:IntRange = 1..10
        //Le pansamos la variable donde tenemos el rango(1, 10) y hacemos que devuelva un resultado al azar
        val getNum:Int = nums.random()
        var question:String = ""

        // Validamos si el usuario adivinado el numero, en caso de que no este se ejecutara hasta que lo adivine
        if (num == getNum){
            //Imprimos un mensaje cuando el usuario haya adivinado el numero
            print("Felicidades, has adivinado el numero $getNum\n")
            //Preguntamos al usuario si desea continuar jugando
            print("¿Desea continuar\n")
            question = readln()
            // Si el usuario dice "si" retornara la misma función (game()) y volvera a repetirse el juego de lo contrario se saldra
            if (question == "si"){
                return game()
            }
        }
    } while (question != "no")
}


game()


