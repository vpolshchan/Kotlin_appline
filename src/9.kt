fun main(args: Array<String>) {
    //Задание 9
    var table = Array<Array<String>>(3){Array(3){""}}
    table[0] = arrayOf("Канада", "Россия", "Италия")
    table[1] = arrayOf("Оттава", "Москва", "Рим")
    table[2] = arrayOf("С$", "₽", "€")
    println("Страна\t\t\tСтолица\t\t\tВалюта")
    for (i in table.indices) {
        for (j in table.indices) {
            print("${table[j][i].toString()} \t\t\t")
        }
        println()
    }
}