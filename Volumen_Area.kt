// Definimos constantes para la base, altura y ancho
const val base = 10f
const val altura = 5f
const val ancho = 5f

fun main() {
    // Calculamos el área del rectángulo utilizando la función areaRectangulo
    val area = areaRectangulo(base, altura)
    
    // Calculamos el volumen del prisma utilizando la función volumen
    val volumen = volumen(ancho, base, altura)
    
    // Imprimimos el área y el volumen
    println("El área del rectángulo es: $area")
    println("El volumen del prisma es: $volumen")
}

// Función para calcular el área de un rectángulo
fun areaRectangulo(base: Float, altura: Float): Float {
    return base * altura
}

// Función para calcular el volumen de un prisma
fun volumen(ancho: Float, base: Float, altura: Float): Float {
    return areaRectangulo(base, altura) * ancho
}
