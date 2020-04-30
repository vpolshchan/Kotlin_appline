fun main(args: Array<String>) {
    //Задание 17+18
    var Aircraft: Aircraft = Aircraft(1,14140,10100)
    println(Aircraft.info())
}
class Aircraft(_number: Int, _range: Int, _capacity: Int){
    var number: Int = _number
    var range: Int = _range
    var capacity: Int = _capacity
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