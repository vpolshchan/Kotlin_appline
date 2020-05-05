fun main(args: Array<String>) {
    //Задание 17+18+19+20+21
    //var Aircraft: Aircraft = Aircraft(1,14140,10100)
    var Boing: Boeing747 = Boeing747(2,14815,242470,581)
    //println(Aircraft.info())
    println(Boing.info())
    println("вместимость пассажиров в Boeing747 ${Boing.pascapacity}")
}
abstract class Aircraft(_number: Int, _range: Int, _capacity: Int){
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
interface Passenger {
    var pascapacity: Int
}
class Boeing747(_number: Int, _range: Int, _capacity: Int, override var pascapacity: Int): Aircraft(_number, _range, _capacity), Passenger{


}