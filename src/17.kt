fun main(args: Array<String>) {
    //Задание 17
    var Aircraft:Aircraft = Aircraft()
    Aircraft.number = 1
    Aircraft.range = 14140
    Aircraft.capacity = 101000
    println(Aircraft.info())
}
class Aircraft{
    var number: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    var range: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    var capacity: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }
    val fuel: Int
        get() = (capacity/range)*100
    fun info(): String{
        var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $capacity,
            расход топлива на 100 км = $fuel
        """.trimIndent()
        return i
    }
}