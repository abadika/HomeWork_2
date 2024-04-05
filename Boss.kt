import GameEntity

class Boss : GameEntity() {
    class Boss : GameEntity{
        private var M4A1: Weapon?

        constructor(name: String, health: Int, damage: Int, M4A1: Weapon?) : super() {
            this.M4A1 = M4A1
        }
        fun getM4A1(): Weapon? {
            return M4A1
        }
        fun setM4A1(M4A1: Weapon?){
            this.M4A1 = M4A1
        }
        }
}


