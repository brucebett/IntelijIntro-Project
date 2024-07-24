import java.time.LocalDate
import java.util.*


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

    var read = Scanner(System.`in`)
    println("Please enter first number:")
    val firstNumber = read.nextFloat()
    println("Please enter second number:")
    val SecondNumber = read.nextFloat()
    val sumAll = firstNumber + SecondNumber
    println("The total is $sumAll")

//    ask the user to key in the year of birth the performs arithematic
//    to display there curent page




            // Create a Scanner object for user input
            val scanner = Scanner(System.`in`)

            // Ask the user to enter their year of birth
            print("Enter your year of birth: ")
            val yearOfBirth = scanner.nextInt()

            // Get the current date
            val currentDate = LocalDate.now()

            // Calculate the age
            val currentYear = currentDate.year
            val age = currentYear - yearOfBirth

            // Display the current age
            println("Your current age is: $age")

            // Close the scanner
            scanner.close()












}