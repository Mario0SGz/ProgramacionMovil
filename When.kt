fun main() {
    gradoEscolar()
}

fun gradoEscolar() {
    print("Ingresa tu edad (escribe solo el número): ")
    var age = readLine()?.toInt()

    when (age) {
        0 -> println("Apenas eres un recién nacido!")
        1 -> println("Solo tienes un año de edad!")
        in 2..5 -> println("Estás en preescolar")
        in 6..11 -> println("Estás en primaria")
        in 12..14 -> println("Estás en secundaria")
        in 15..17 -> println("Estás en bachillerato")
        in 18..25 -> println("Estás en universidad")
        else -> {
            println("Edad inválida\nVuelve a correr el código") // Manejo de edad no válida
        }
    }
}
