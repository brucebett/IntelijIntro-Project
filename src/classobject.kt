import java.awt.Color

fun main(args: Array<String>) {
    val obj1 = Person("George", 23)
    println(obj1.name)
    println(obj1.age)
    println(obj1.canVote(11))

    val obj2 = Person("bett", 50)
    println(obj2.name)
    println(obj2.age)
    println(obj2.canVote(23))

//    instances of class Bulb
    val bulb1 = Bulb()
    bulb1.turnOn()
    println(bulb1.displayBulbstatus())
    bulb1.turnOff()
    println(bulb1.displayBulbstatus())

    val bulb2 = Bulb()
    bulb2.turnOn()
    println(bulb2.displayBulbstatus())
    bulb2.turnOff()
    println(bulb2.displayBulbstatus())

}
    class Person(var name: String, var age: Int) {
        fun canVote(age: Int) {
            if (age > 18) {
                println("You can vote")
            } else {
                println("You cannot vote")
            }
        }
    }

class Bulb(){
    var isOn: Boolean=false
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayBulbstatus(){
        if(isOn==true){
            println("Bulb is on")
        }else{
            println("Bulb is off")
        }
    }
}

class Animal(var color: Color , var name: String){
    fun canVote(age: Int) {
        if (age > 18) {
            println("You can vote")
        } else {
            println("You cannot vote")
        }
    }

}

