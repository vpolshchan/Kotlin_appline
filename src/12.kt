fun main(args: Array<String>) {
    //Задание 12
    println("Введи год и нажми Enter")
    var year: String? = readLine()
    if(yearIsLofty(year!!.toInt())){
        println("Високосный")
    }
    else {println("Обычный")}
}

fun yearIsLofty(year: Int): Boolean {
    return if (year % 4 !=0) {
        (false)//"Обычный"
    }
    else if(year % 100 == 0) {
        if(year % 400 == 0) {
            (true) //"Високосный"
        } else {
            (false)//"Обычный"
        }
    }
    else {
        (true)
    }//"Високосный"
}