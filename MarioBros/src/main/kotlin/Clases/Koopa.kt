package Clases

class Koopa:
    Enemy("Koopa", 2){
    override fun collision(collider: String) {
        //super.collision(collider)
        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDirection()
        }
        println("Usando la colisión de la clase Enemy")
    }
}
//Polimorfismo: "Muchas Formas"