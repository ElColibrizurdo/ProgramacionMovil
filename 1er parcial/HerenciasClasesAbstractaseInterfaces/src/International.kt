

class International(override val country: String, override val city: String) : Travel() {

    override fun getPrice(numDays: Int): Int {
        val basePrice = getBasePrice(city)
        val taxPercentage = getTaxPercentage(country)
        if (basePrice == 0 || taxPercentage == 0) {
            println("Lo sentimos, la ciudad o el país seleccionados no son válidos.")
            return 0
        }
        val producto = numDays * basePrice
        val totalPrice = (1 + taxPercentage / 100.0) * producto
        return totalPrice.toInt()
    }

    override fun getBasePrice(city: String): Any {
        return when (city) {
            "Munich" -> 980
            "Berlín" -> 820
            "Francfort" -> 850
            "Santiago" -> 643
            "Valparaíso" -> 721
            "Vancouver" -> 620
            "Ottawa" -> 680
            "Montreal" -> 600
            else -> 0
        }
    }

    override fun getTaxPercentage(country: String): Any {
        return when (country) {
            "Alemania" -> 16
            "Chile" -> 5
            "Canadá" -> 10
            else -> 0
        }
    }

    private val cityAndCountry = mapOf(
        "Munich" to "Alemania" to 980,
        "Berlín" to "Alemania" to 820,
        "Francfort" to "Alemania" to 850,
        "Santiago" to "Chile" to 643,
        "Valparaíso" to "Chile" to 721,
        "Vancouver" to "Canadá" to 620,
        "Ottawa" to "Canadá" to 680,
        "Montreal" to "Canadá" to 600

    )
}