// Importamos la función pow de la biblioteca de matemáticas
import kotlin.math.pow

// Definimos constantes para PHI y PI
const val PHI = 1.618f
const val PI = 3.1416f

// Función principal (entry point)
fun main() {
    val radius = 4f // Kotlin asigna automáticamente el tipo de variable basado en el valor
    val area = circleArea(radius)
    print("\n") // Imprimimos una línea en blanco
    println("El área del círculo es: $area") // Utilizamos una plantilla de cadena para imprimir el área

    printName("Erick Montoya") // Llamamos a la función para imprimir el nombre
    printAge(21) // Llamamos a la función para imprimir la edad
    getPi() // Llamamos a la función para obtener el valor de PI
    printPHI() // Llamamos a la función para imprimir el valor de PHI
}

// Función para calcular el área de un círculo
fun circleArea(radius: Float): Float {
    return PI * radius.pow(2)
}

// Función para imprimir un nombre
fun printName(name: String) {
    println("Mi nombre es $name")
}

// Función para imprimir una edad
fun printAge(age: Int) {
    println("Tengo $age años de edad")
}

// Función para obtener el valor de PI
fun getPi(): Float {
    return PI
}

// Función para imprimir el valor de PHI
fun printPHI() {
    println("El valor del número áureo es: $PHI")
}
