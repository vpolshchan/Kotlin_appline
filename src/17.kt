fun main(args: Array<String>) {
    //Задание 17+18+19+20+21+22=25
    var a: ArrayList<Aircraft> = arrayListOf()
    a.add(pasAirplane("Boing747", 14815, 242470, 581))
    a.add(cargoAirplane("AN-225", 4000, 300000, 250000))
    a.add(fireAirplane("IL-78", 11230, 118000, 60000))
    var i = ""
    while (i != "exit") {
        println(
            """Меню:
            |1 - Добавить самолет авиакомпании
            |2 - Посмотреть в консоли список всех самолетов авиакомпании
            |3 - Посмотреть характиристики самолета
            |4 - Выход из программы
            |Введи меню и нажми Enter
            """.trimMargin()
        )
        var res = readLine()
        var number = ""
        var range = 0
        var tankcapacity = 0
        var pascapacity = 0
        var cargo_capacity = 0
        when (res!!.toInt()) {
            1 -> {
                println("""Выбери тип самолета
                        |1 - Пассажирский
                        |2 - Гурзовой
                        |3 - Пожарный
                        |4 - Вернуться в меню
                        |Введи номер меню и нажми Enter
                        """.trimMargin()
                )
                res = readLine()
                when (res!!.toInt()) {
                    1 -> {
                        println("Введи номер воздушного судна")
                        number = readLine().toString()
                        println("Введи максимальную дальность полета")
                        range = readLine()!!.toInt()
                        println("Введи вместимость бака")
                        tankcapacity = readLine()!!.toInt()
                        println("Введи вместимость пассажиров")
                        pascapacity = readLine()!!.toInt()
                        a.add(pasAirplane(number,range,tankcapacity,pascapacity))
                    }
                    2 -> {
                        println("Введи номер воздушного судна")
                        number = readLine().toString()
                        println("Введи максимальную дальность полета")
                        range = readLine()!!.toInt()
                        println("Введи вместимость бака")
                        tankcapacity = readLine()!!.toInt()
                        println("Введи грузоподъемность")
                        cargo_capacity = readLine()!!.toInt()
                        a.add(cargoAirplane(number,range,tankcapacity,cargo_capacity))
                    }
                    3 -> {
                        println("Введи номер воздушного судна")
                        number = readLine().toString()
                        println("Введи максимальную дальность полета")
                        range = readLine()!!.toInt()
                        println("Введи вместимость бака")
                        tankcapacity = readLine()!!.toInt()
                        println("Введи грузоподъемность")
                        cargo_capacity = readLine()!!.toInt()
                        a.add(fireAirplane(number,range,tankcapacity,cargo_capacity))
                    }
                    4 -> {
                        println("Ок!")
                    }
                }
            }
            2 -> {
                println("Список самолетов авиакомпании:")
                a.forEachIndexed { index, value -> println("#${index+1} ${value.number.toString()}") }
            }
            3 -> {
                println("Введи номер воздушного судна")
                var index = readLine()!!.toInt()
                println("Характиристики самолета #$index ${a.get(index-1).number} \n${a.get(index-1).info()}")
            }
            4 -> {
                println("Пока!")
                i = "exit"
            }
                else -> println("Нет такого пункта меню, пока")
        }
    }
}

abstract class Aircraft(_number: String, _range: Int, _tankcapacity: Int){
    var number: String = _number
    protected var range: Int = _range
    protected var tankcapacity: Int = _tankcapacity
    protected val fuel: Int
        get() = (tankcapacity/range)*100
    open fun info(): String{
        var i: String = ""
        return i
    }
}
interface passenger {
    var pascapacity: Int
}
interface cargo {
    var cargo_capacity: Int
}
class pasAirplane(_number: String, _range: Int, _tankcapacity: Int, override var pascapacity: Int): Aircraft(_number, _range, _tankcapacity), passenger{
    override fun info(): String {
        var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $tankcapacity,
            расход топлива на 100 км = $fuel
            вместимость пассажиров $pascapacity
        """.trimIndent()
        return i
    }
}
class cargoAirplane(_number: String, _range: Int, _tankcapacity: Int, override var cargo_capacity: Int): Aircraft(_number, _range, _tankcapacity), cargo{
    override fun info(): String {
        var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $tankcapacity,
            расход топлива на 100 км = $fuel
            грузоподъемность $cargo_capacity
        """.trimIndent()
        return i
    }
}
class fireAirplane(_number: String, _range: Int, _tankcapacity: Int, override var cargo_capacity: Int): Aircraft(_number, _range, _tankcapacity), cargo{
    override fun info(): String {
        var i: String = """
            номер воздушного судна $number,
            максимальная дальность полета $range,
            вместимость бака $tankcapacity,
            расход топлива на 100 км = $fuel
            объем $cargo_capacity
        """.trimIndent()
        return i
    }
}
