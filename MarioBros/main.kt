import Clases.Goomba
import Clases.Koopa
import Clases.Mario

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