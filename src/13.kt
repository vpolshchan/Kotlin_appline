fun main(args: Array<String>) {
    //Задание 13
    var empl: ArrayList<String> = arrayListOf("Иванов","Петров","Сидоров")
    var i = ""
    while (i != "exit") {
        println(
            """Меню:
        |1 - Добавить сотрудника.
        |2 - Посчитать количество сотрудников.
        |3 - Вывести всех сотрудников
        |4 - Выход из программы.
        |Введи номер меню и нажми Enter
    """.trimMargin()
        )
        var res = readLine()
        when (res!!.toInt()) {
            1 -> {
                println("Введи фамилию сотрудника и нажми Enter:")
                var addempl = readLine().toString()
                empl.add(addempl)
            }
            2 -> {
                val array = arrayOfNulls<String>(empl.size)
                println("Количество сотрудников: ${countOfEmployee(*empl.toArray(array) as Array<out String>)}")
            }
            3 -> {println("Список сотрудников:")
                for(e in empl)
                    println(e)
            }
            4 -> {println("Пока!")
                i="exit"}
            else -> println("Нет такого пункта меню, пока")
        }
    }
}
fun countOfEmployee(vararg empl: String): Int {
    var count: Int = 0
    for(e in empl)
        ++count
    return count
}