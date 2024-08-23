// Kotlin Program to Multiply two Floating Point Numbers
// Program to Find ASCII value of a character
fun main()
{
    println("Enter a float value")
    var num1:Float = readln().toFloat()
    println("Enter a float value")
    var num2:Float = readln().toFloat()
    println("Multiplex : ${num1*num2}")

        println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")

    println("Enter a character ")
    var c:Char = readln()[0]
    var ascii:Int = c.toInt()
    println("Ascii value of $c is : $ascii");
}