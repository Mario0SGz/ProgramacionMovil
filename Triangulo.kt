// Definimos constantes para los lados del triángulo
const val lado1 = 3.00f
const val lado2 = 1.00f
const val lado3 = 2.00f
var tipo = "" // Variable para almacenar el tipo de triángulo

fun main() {
    type(lado1, lado2, lado3) // Llamamos a la función type con los valores de los lados
    print("Es un triángulo de tipo: $tipo") // Imprimimos el tipo de triángulo
}

// Función para determinar el tipo de triángulo
fun type(lado1: Float, lado2: Float, lado3: Float) {
    if (lado1 == lado2 && lado2 == lado3) { // Si todos los lados son iguales
        tipo = "equilátero" // Es un triángulo equilátero
    } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) { // Si todos los lados son diferentes
        tipo = "escaleno" // Es un triángulo escaleno
    } else {
        tipo = "isósceles" // En cualquier otro caso, es un triángulo isósceles
    }
}
