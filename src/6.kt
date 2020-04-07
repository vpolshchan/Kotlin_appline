fun main(args: Array<String>) {
    //Задание 6
    println("Введи первое число a и нажми Enter:")
    var a: String? = readLine()
    a!!.toInt()
    println("Введи второе число b и нажми Enter:")
    var b: String? = readLine()
    b!!.toInt()
    var c = a>b
    println("a>b is ${c}")
}