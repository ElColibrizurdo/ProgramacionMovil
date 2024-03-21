class Travel {

    protected val country: String
    protected val city: String
    protected val servicetype = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    fun reserve(numDays: Int) {
        if (reserved) {
            println("""Ya reservaste tu vaije
                |Pais: $country
                |Ciudad: $city
                |Precio: $paidAmount
            """.trimMargin())
            return
        }

        val amount = getPrice(numDays)

        if (amount == 0) {
            return
        }
        reserved = true
        paidAmount = amount
        println("""Viaje reservado exitosamente
            |Pais: $country
            |Ciudad: $city
            |Precio: $paidAmount
        """.trimMargin())
    }
}