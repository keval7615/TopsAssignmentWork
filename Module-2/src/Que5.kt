//Kotlin Program to Check Whether a Number is Even or Odd
fun main()
{
    println("Enter a num ")
    var num:Int = readln().toInt()
    var res = if (num%2==0) "$num is Even" else " $num is odd"

    println("Res : $res")

}