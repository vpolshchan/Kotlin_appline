fun main(args: Array<String>) {
    //Задание 11
    var workplaces: Map<Int, String> = mapOf(1 to "Иванов И.И.", 2 to "Петров П.П.", 3 to "Сидоров С.С.")
    var i = ""
    while (i != "exit") {
        println("""Меню:
        |1 - Добавить рабочее место и сотрудник.
        |2 - Показать всех сотрудников.
        |3 - Показать сотрудника по месту.
        |4 - Выход из программы.
        |Введи номер меню и нажми Enter
        """.trimMargin()
        )
        var res = readLine()
        if (res != null) {
            when (res.toInt()) {
                1 -> {
                    i=""
                    while (i!="done") {
                        println("Введи номер места и нажми Enter:")
                        var place = readLine()!!.toInt()
                        if (!workplaces.containsKey(place)) {
                            println("Введи ФИО сотрудника и нажми Enter:")
                            var employee = readLine().toString()
                            workplaces += place to employee
                            println("Добавлено новое место №$place, сотрудник $employee")
                            i="done"
                        } else {
                            println("Место №$place - занято")
                        }
                    }
                }
                2 -> {
                    println("Список всех рабочих мест и сотрудников:")
                    println(workplaces)
                }
                3 -> {
                    println("Введи номер места для поиска и нажми Enter:")
                    var place = readLine()!!.toInt()
                    if (workplaces.containsKey(place)) {
                        var employee = workplaces.getValue(place)
                        println("На месте №$place сидит содрудник:$employee")
                    } else {
                        println("Место №$place - не найдено")
                    }
                }
                4 -> {
                    println("Пока!")
                    i = "exit"
                }
                else -> println("Нет такого пункта меню, повтори")
            }
        }
    }
}