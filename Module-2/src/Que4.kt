// Kotlin Program to Compute Quotient and Remainder
fun main()
{
    println("Enter a 1st number ")
    var num1:Int = readln().toInt()

    println("Enter a 2nd number ")
    var num2:Int = readln().toInt()

    println("Quotient: ${num1/num2}")
    println("Reminder: ${num1%num2}")
}