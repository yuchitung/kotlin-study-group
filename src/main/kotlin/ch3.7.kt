fun main() {
    val name: String = "Link"
    val healthPoints: Int = (0..100).shuffled().first()
    val isBlessed: Boolean = listOf(true, false).shuffled().first()
    val isImmortal: Boolean = false

    val auraVisible: Boolean = isBlessed && healthPoints > 50 || isImmortal
    val karma: Int = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    var auraColor: String = when (karma) {
        in 0..5 -> "RED"
        in 6..10 -> "ORANGE"
        in 11..15 -> "PURPLE"
        in 16..20 -> "GREEN"
        else -> "UNKNOWN"
    }

    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    val stausFormatString = "(HP)(A) -> H"
    println(
        stausFormatString
            .replace("HP", "HP:$healthPoints")
            .replace("A", "Aura: $auraColor")
            .replace(" -> H", " -> $name $healthStatus")
    )
}