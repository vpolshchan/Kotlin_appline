fun main(args: Array<String>) {
    //Задание 23
    var a: Array<Car> = Array(2) {Car("empty","empty",0)}
    a[0] = Car("BNW","green",123456)
    a[1] = Car("Mercedes","black",654321)
for(x in a.indices) {println("Car #${x+1} - ${a[x]}")}
}
data class Car (val model: String, val color: String,val number: Int){
    override fun toString(): String {
        return  "model: $model, color: $color, number: $number"
    }
}
