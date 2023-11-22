


import Clases.Goomba
import Clases.Koopa
import Clases.Mario

/*fun main(){
        //Clase Telefono
        val myPhone = Phone()
        myPhone.getTurn()
        myPhone.turnOn()
        myPhone.getTurn()
        //Clase Vehiculo
        val miVehiculo = Vehiculos("Ford","2020","Verde")
        miVehiculo.placas = "NNT3047"
        println("El coche está encendido? ${miVehiculo.encendido}")
        miVehiculo.encender()
        println("El coche encendio? ${miVehiculo.encendido}")
        println("El tanque tiene ${miVehiculo.gasolina}")
        miVehiculo.recargar(20.07f)
        println("El tanque ahora tiene ${miVehiculo.gasolina}")
        val golNegro = Vehiculos("Volkswagen", "Gol")
        // Crear un nuevo auto pasandole todos los argumentos con NamedArguments
        val sonicAzul = Vehiculos(
                marca = "Ford",
                modelo = "Sonic",
                color = "Azul",
                placas = "ALS9763"
        )
        println(golNegro)
        println(sonicAzul)
    }*/
// Constructores son metodos q definen cuales son los atributos minimos requeridos para crear un objeto
// El constructor solo define atributos

//Modificadores de acceso
// private: Que es accesible solo dentro de la clase que lo contiene
// protected: Solo se tiene acceso dentro de la claase y por medio de las clases que heredan de este
// internal: Accesible entre modulos una serie de archivos compilados en conjunto
// public: Como su nombre lo indica, da un acceso global

// Definiremos dos atributos: State, lives

fun main(){
        var mario = Mario()
        /*for (i in 1..5){
                if(mario.isAlive){
                        mario.collision("Goomba")
                        println("Te quedan ${mario.getLives()}")
                }
                println("Te quedan ${mario.getLives()}")
        }*/
        mario.collision("star")
        /*val enemy = Enemy("Un enemigo",2)
        enemy.collision("Enemy")
        enemy.collision("Weapon")*/
        val enemy = Goomba()
        enemy.collision("Enemy")
        enemy.collision("Weapon")
        val koopa = Koopa()
        koopa.collision("Weapon")
}

//Getters y Setters
// Los atributos de una clase pueden ser leidos y escritos. Como mencionamos,
// el modificador private impidee que fuera de la clase se pueda interactuar con un metodo o atributo,
// pero si un agente externo requiere poder sumar algun valor a un numero sin tener acceso al valor
// actual o a modificarlo directamente, necesitamos usar un setter.
// Get y Set desde Kotlin

//Herencia
//Permite la creación de las clases "hijo" o subclases a partir de una clase "padre" o super clase,
//esta superclase hereda los atributos y metodos que esten permitidos por encapsulamiento
//(Dependiendo de modificador de acceso asignado a cada propiedad) a sus subclases. Pueden existir varias subclases de
// una superclase, pero no una subclase con varias superclases

//Encapsulamientos.

/*Clases abstractas: Crear una clase que su objetivo sea definitorio, las clases abstractas no pueden ser instanciadas
Dichas clases permiten crear métodos abstractos y métodos concretos (que no y si tienen cuerpo)*/