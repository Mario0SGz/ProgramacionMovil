package Clases

class Vehiculo {
    init {
        println("Vehiculo Creado")
    }
    companion object Factory{
        fun create() : Vehiculo = Vehiculo()
    }
}