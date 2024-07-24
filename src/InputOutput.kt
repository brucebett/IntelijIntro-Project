fun main(args: Array<String>) {
    println("please type your name here: ")
    var enterName = readLine()
    println(enterName)

    println("What is your age?")
    var enteredAge = readLine()
    println("You have entered your age as $enteredAge")

    println("Where do you stay?")
    var enteresStay = readLine()
    println("How many children do you have?")
    var enteredChildren = readLine()
    println("I stay is $enteresStay with my $enteredChildren children")


//    ask the user for two then do the summation and display it out

    println("Enter First number:")
    var num1 = readLine()
    println("Enter Second number:")
    var num2 = readLine()
    var summation = num1 + num2

    println("Total = $summation")
}