class Enemy(val name: String, val strength: Int) {

    protected var direction: String = "LEFT"
    protected fun changeDirection() {
        direction = if (direction == "RIGHT")
            "LEFT"
        else
            "RIGHT"
        println("$name va en $direction")
    }

    protected fun die() {
        println("$name ha muerto")
    }

    fun collision(collider: String) {
        when(collider) {
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}