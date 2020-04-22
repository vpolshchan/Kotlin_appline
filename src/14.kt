fun main(args: Array<String>) {
    //Задание 14
    var position: String = ""
    var fullname: String = ""
    var status: String = ""
    var i = ""
    while (i != "exit") {
        println("Введи ФИО сотрудника и нажми Enter")
        fullname = readLine().toString()
        if (fullname != "") break
        else println("Это поле обязательное")
    }
    println("Введи возраст сотрудника и нажми Enter")
    var inage = readLine()
    var age: Int = 0
    if (inage != "") age=inage!!.toInt()
    println("Введи семейное положение сотрудника и нажми Enter")
    status = readLine().toString()
    while (i != "exit") {
        println("Введи должность сотрудника и нажми Enter")
        position = readLine().toString()
        if (position != "") break
        else println("Это поле обязательное")
    }
    var out:String = ""
    if (inage == "" && status == "") out = printEmpl (fullname, position)
    if (inage == "" && status != "") out = printEmpl (fullname, status, position)
    if (inage != "" && status == "") out = printEmpl (fullname, age, position)
    if (inage != "" && status != "") out = printEmpl (fullname, age, status, position)

    println(out)
}


fun printEmpl (fullname: String, position: String): String {
    var str = StringBuilder()
    str.append(fullname)
        .append(" ")
        .append(position)
    return str.toString()
    //println("fun1 $fullname $position")
}
fun printEmpl (fullname: String, age: Int, position: String): String {
    var str = StringBuilder()
    str.append(fullname)
        .append(" ")
        .append(age)
        .append(" ")
        .append(position)
    return str.toString()
    //println("fun2 $fullname $age $position")
}
fun printEmpl (fullname: String, status: String, position: String): String {
    var str = StringBuilder()
    str.append(fullname)
        .append(" ")
        .append(status)
        .append(" ")
        .append(position)
    return str.toString()
    //println("fun3 $fullname $status $position")
}
fun printEmpl (fullname: String, age: Int, status: String, position: String): String {
    var str = StringBuilder()
    str.append(fullname)
        .append(" ")
        .append(age)
        .append(" ")
        .append(status)
        .append(" ")
        .append(position)
    return str.toString()
    //println("fun4 $fullname $age $status $position")
}