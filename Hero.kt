data class Hero(

    private val health: Int,
    private val damage: Int,
    private val superpower: String
) {
    constructor(health: Int, damage: Int) : this(health, damage, "Отсутствует")

    fun getHealth(): Int = health
    fun getDamage(): Int = damage
    fun getSuperpower(): String = superpower

}