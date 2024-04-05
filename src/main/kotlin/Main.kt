

fun main() {
    val boss = Boss()
    boss.setAbility("Barrier")
    boss.setDamage(99)
    boss.setHealth(1000)

    val weapon = Weapon()
    weapon.setWeaponName("Ak47")
    weapon.setWeaponType("Огнестрельный")

    println("Boss Ability - ${boss.getAbility()}")
    println("Boss Damage - ${boss.getDamage()}")
    println("Boss Health - ${boss.getHealth()}")
    println("Boss WeaponName - ${weapon.getWeaponName()}")
    println("Boss WeaponType - ${weapon.getWeaponType()}")
}

class Weapon {
    fun setWeaponName(s: String) {
    }
    fun setWeaponType(s: String) {
    }

    fun getWeaponName() {


    }

    fun getWeaponType() {


    }
}
class Boss {
    fun setAbility(s: String) {
    }
    fun setDamage(i: Int) {
    }
    fun setHealth(i: Int) {
    }
    fun getAbility() {
    }
    fun getDamage() {

    }

    fun getHealth() {


    }

}
