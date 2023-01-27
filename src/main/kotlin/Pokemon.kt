open class Pokemon(
    var name: String,
    var level: Int,
    var trefferPunkt: Int,
    var type: String,
    var schadenWert: Double = 0.5 * level,
    var isKo: Boolean = false

) {
    fun looseTP(lost: Int) {
        this.trefferPunkt -= lost
        if (trefferPunkt <= 0) {
            isKo = true
            println("isKo würde auf true gesetzt")
        }

    }

    open fun attack(pok: Pokemon) {
        var feuer: Pokemon

    }

}

class FeuerPokemon(
    name: String,
    level: Int,
    trefferPunkt: Int,
    schadenWert: Double = 0.5 * level,
    isKo: Boolean = false
) : Pokemon(name, level, trefferPunkt, type = "Feuer", schadenWert, isKo) {
    override fun attack(pok: Pokemon) {
        var multiplikator = 1.0
        if (pok.type == "Pflanze") {
            multiplikator = 2.0
        }
        if (pok.type == "Wasser") {
            multiplikator = 0.5
        }
        pok.looseTP((schadenWert * multiplikator).toInt())
    }

}