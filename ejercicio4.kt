// -> Condicional multiple con when <-
// Elaborar un programa que realice la opción seleccionada de acuerdo a lo siguiente:
// a. Área del triángulo (Solicitar base y altura) (b * h / 2)
// b. Perimetro de un cuadrado (Solicitar lados) (l + l + l + l)
// c. Área de un cuadrado (Solicitar lados)(l * l)


// Solicitar al usuario que ingrese una opción
print("Ingresa una opcion \n\n a. Area del triangulo \n b. Perimetro de un cuadrado \n c. Area de un cuadrado\n")
//Almacenamos la opción en una variable
val option:String = readln()

// Utilizamos la opción y la mandamos a evaluar
when (option){
    "a" -> areaTriangulo()
    "b" -> periCuadrado()
    "c" -> areaCuadrado()
    else -> print("No existe la opcion\n")
}

// Función para calcular el área de un triangulo
fun areaTriangulo() {
    //Pedimos los datos a ingresar y los almacenamos en una variable
    print("Ingrese base\n")
    val b:Float = readln().toFloat()
    print("Ingrese la altura\n")
    val h:Float = readln().toFloat()
    //Operación para el área de un triangulo
    val resultado:Float = (b * h) / 2
    //Imprimimos el resultado de la operación
    print("El area del triangulo es de $resultado\n")

}
// Función para calcular el perímetro de un triangulo
fun periCuadrado() {
    //Pedimos los datos a ingresar y los almacenamos en una variable
    print("Ingrese lado 1\n")
    val lado_1:Float = readln().toFloat()
    print("Ingrese lado 2\n")
    val lado_2:Float = readln().toFloat()
    print("Ingrese lado 3\n")
    val lado_3:Float = readln().toFloat()
    print("Ingrese lado 4\n")
    val lado_4:Float = readln().toFloat()
    //Operación para el perímetro de un cuadrado
    val resultado:Float = lado_1 + lado_2 + lado_3 + lado_4
    print("El perimetro es de $resultado \n")
}
// Función para calcular el área de un cuadrado
fun areaCuadrado() {
    //Pedimos los datos a ingresar y los almacenamos en una variable
    print("Ingrese lado 1 \n")
    val lado_1:Float = readln().toFloat()
    print("Ingrese lado 2 \n")
    val lado_2:Float = readln().toFloat()
    //Operación para el área de un cuadrado
    val result:Float = lado_1 * lado_2
    print("El area del cuadrado es de $result \n")
}
