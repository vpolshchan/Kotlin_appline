fun main(args: Array<String>) {
    //Задание 17+18+19+20+21+22
    var Boing: Boeing747 = Boeing747(2,14815,242470,581)
    println(Boing.info())
}
abstract class Aircraft(_number: Int, _range: Int, _capacity: Int){
    protected var number: Int = _number
    protected var range: Int = _range
    protected var capacity: Int = _capacity
    protected val fuel: Int
        get() = (capacity/range)*100
    open fun info(): String{
        var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $capacity,
            расход топлива на 100 км = $fuel
        """.trimIndent()
        return i
    }
}
interface Passenger {
    var pascapacity: Int
}
class Boeing747(_number: Int, _range: Int, _capacity: Int, override var pascapacity: Int): Aircraft(_number, _range, _capacity), Passenger{
 override fun info(): String {
     var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $capacity,
            расход топлива на 100 км = $fuel
            вместимость пассажиров $pascapacity
        """.trimIndent()
     return i
 }
}