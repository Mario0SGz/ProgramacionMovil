fun main() {
    // Definimos una variable decimal
    val decimal: Double = 3.14
    //Imprimimos la variable 
    println(decimal)

    // Imprimimos el tipo de dato por defecto de la variable decimal
    println("El tipo de dato por defecto de la variable decimal es: ${decimal::class.simpleName}")

    // Convertimos la variable decimal a tipo Float
    val decimalComoFloat: Float = decimal.toFloat()
    //Imprimimos la variable float
    println(decimalComoFloat)

    // Definimos una constante con el valor de PI
    const val PI: Double = 3.14159265359
    //Imprimimos la costante
    println(PI)


    // Calculamos el perímetro del círculo
    val perimetro = 2 * decimal

    // Usamos un String Template para imprimir el resultado
    println("El perímetro del círculo es: $perimetro")
}
