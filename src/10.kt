fun main(args: Array<String>) {
    //Задание 10
    var cities: ArrayList<String> = arrayListOf()
    var i = ""
    while (i != "exit") {
        println(
            """Меню:
        |1 - Добавить название города в программу.
        |2 - Посмотреть в консоли список всех добавленных городов
        |3 - Посмотреть список добавленных городов без повторений
        |4 - Выход из программы
        |Введи номер меню и нажми Enter
    """.trimMargin()
        )
        var res = readLine()
        when (res!!.toInt()) {
            1 -> {
                println("Введи название города и нажми Enter:")
                var addcity = readLine().toString()
                cities.add(addcity)
            }
            2 -> {
                println("Список названий городов:")
                cities.forEach{println(it)}
            }
            3 -> {
                println("Список уникальных названий городов:")
                cities.distinct().forEach{println(it)}
            }
            4 -> {println("Пока!")
                i="exit"}
            else -> println("Нет такого пункта меню, пока")
        }
    }
}