import kotlin.math.pow

fun main(args: Array<String>) {
    //Задание 16
    var i = ""
    var a: Double = 0.0
    var b = ""
    var c = ""
    var n = 0
    while (i == "") {
        println("Введи число для нахождения корня и нажми Enter")
        b = readLine().toString()
        if (b != "") {
            a = b.toDouble()
            break
        }
    }
    while (i == "") {
        println("Введи степень корня и нажми Enter")
        c = readLine().toString()
        if (c != "") {
            n = c.toInt()
            break
        }
    }
    println("Корень $n-й степени числа $b = ${a?.sqrt2(n)}")
}

fun Double.sqrt2(n: Int): Double {
    var x: Double = (this / 4).toDouble()
    var y: Double = 0.0
    while (y != x) {
        y = x
        x = ((n-1)*x + this / x.pow(n-1) )/ n
    }
    return x
}