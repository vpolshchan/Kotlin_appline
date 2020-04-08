fun main(args: Array<String>) {
    //Задание 8
    println("Введи сумму вклада и нажми Enter")
    var vk = readLine()!!.toFloat()
    println("Введи длительность вклада (количество месяцев) и нажми Enter")
    var mon = readLine()!!.toInt()
    println("Введи ежемесячный процент по вкладу и нажми Enter")
    var perc = readLine()!!.toFloat()
    var percM: Float
    for (i in 1..mon){
        percM = (vk * perc  / mon) / 100
        vk += percM
        println("В месяце №$i ты заработаешь ${"%.2f".format(percM)}, в итоге сумма вклада будет: ${"%.2f".format(vk) }")
    }
}
