package Clases

class Vehiculos (val marca: String, val modelo: String, var color: String = "Negro"){

    init {
        println("""Los datos del coche son:
            marca: $marca
            modelo: $modelo
            color: $color""")
    }
    constructor(marca: String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas
        println("Las placas son: ${this.placas}")
    }

    //atributos
    var placas = ""
    var gasolina = 0f
    var encendido = false

    //metodos
    fun encender(){
        encendido = true
    }
    fun apagar(){
        encendido = false
    }
    fun recargar(litros:Float){
        gasolina+=litros
    }
}

