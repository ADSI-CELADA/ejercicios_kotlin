// -> Condicional doble <-
// Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos superiores
// a 1000 € mensuales. Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y
// muestre por consola si el usuario tiene que tributar o no.


// Solicitar al usuario su edad, sus ingrensos mensuales almacenandolos en una variable

print("Ingrese su nombre\n")
//Ingresar nombre
var nombreUser:String = readln()
//Ingresa edad
print("Ingrese su edad \n")
var age:Int = readln().toInt()
//Ingresar impuesto
print("Ingrese su impuesto \n")
var salario:Float = readln().toFloat()


// Evaluar la condición para saber si podra tributar o no
if (age > 16 && salario >= 1000){
    //Imprimir por consola si se cumple la condición
    print("Nombre: $nombreUser \n edad: $age \n puede tributar")
} else {
    //Imprimir por consola en caso de que no se cumpla la condición
    print("Nombre: $nombreUser \n edad: $age \n no puede tributar")
}