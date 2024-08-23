//WAP to find max value using function as express


fun main() {


    fun maximum(num1: Int, num2: Int): String {
        return if (num1 > num2) "num 1 is greater" else "num 2 is greater"
    }

    println(maximum(12, 23))

    fun maximum(num1: Int, num2: Int, num3: Int): String {
        return if (num1 > num2 && num1 > num3)
            "num1 is greater"
        else if (num2 > num1 && num2 > num3)
            "num2 is greater"
        else
            "num3 is greater"
    }
    println(maximum(12, 23,45))

}
