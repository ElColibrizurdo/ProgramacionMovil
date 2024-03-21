class Mario(var vidas: Int = 3) {

    init {
        println("Its a me mario")
    }

    private var state = "small"
    private var lives = 3

    private fun die() {
        vidas--
        println("Has perdido una vida")
    }

    fun collision(collisionObj: String) {
        when(collisionObj) {
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido no pasa nada")
        }
    }
}