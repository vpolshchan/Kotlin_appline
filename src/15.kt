fun main(args: Array<String>) {
    //Задание 15
    var mass: Array<String> = arrayOf("One", "Two", "Three")
    var print = {message: Array<String> ->
        for (i in message)
            println(i)
    }
    print(mass)
}