fun main(args: Array<String>) {
    //Задание 7
    var res = 0
    println("Вопрос №1\nСколько будет 1+1?\nвыбери вариант 1, 2 или 3")
    println("1. 2\n2. 5\n3. 4")
    var q1: String? = readLine()

    if (q1!!.toInt()==1){
        ++res
        println("Верно")
    }
    else{println("Ошибся")}

    println("Вопрос №2\nСколько будет 2+2?\nвыбери вариант 1, 2 или 3")
    println("1. 3\n2. 4\n3. 7")
    var q2: String? = readLine()
    if (q2!!.toInt()==2){
        ++res
        println("Верно")
    }
    else{println("Ошибся")}

    println("Вопрос №3\nСколько будет 3+3?\nвыбери вариант 1, 2 или 3")
    println("1. 8\n2. 4\n3. 6")
    var q3: String? = readLine()
    if (q3!!.toInt()==3){
        ++res
        println("Верно")
    }
    else{println("Ошибся")}

    println("Вопрос №4\nСколько будет 4+4?\nвыбери вариант 1, 2 или 3")
    println("1. 10\n2. 8\n3. 7")
    var q4: String? = readLine()
    if (q4!!.toInt()==2){
        ++res
        println("Верно")
    }
    else{println("Ошибся")}

    println("Вопрос №5\nСколько будет 5+5?\nвыбери вариант 1, 2 или 3")
    println("1. 12\n2. 11\n3. 10")
    var q5: String? = readLine()
    if (q5!!.toInt()==3){
        ++res
        println("Верно")
    }
    else{println("Ошибся")}

    println("Итого правильных ответов: ${res} из 5")
    when(res){
        0 -> println("Ужасно")
        1 -> println("Очень плохо")
        2 -> println("Плохо")
        3 -> println("Нормально")
        4 -> println("Хорошо")
        5 -> println("Отлично")
        else -> println("Ошибка")
    }
}