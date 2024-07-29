fun main(args: Array<String>) {
val mathTeacher1 = MathTeacher("Andrew", 56)
    println(mathTeacher1.teacherMath())

    val mathTeacher2 = MathTeacher("Njoki", 1)
    println(mathTeacher2.teacherMath())

    var teacherScience1 = ScienceTeacher("wendy",26)
    println(teacherScience1.teacherScience())
}





open class Teacher(var name: String, var age: Int){
    init {
        println("My name is $name")
        println("I am $age years old")
    }
}

class MathTeacher(name: String,age: Int):Teacher(name,age){
    fun teacherMath(){
        println("I teach Mathematics")
    }
}

class ScienceTeacher(name: String,age: Int): Teacher(name,age){
    fun teacherScience(){
        println("I teach Science")
    }
}
}
class EnglishTeacher(){

}
class GeographyTeacher(){

}