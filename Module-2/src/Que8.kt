fun main() {
    var str: String = "My Name is keval"
    var count = 0
    println("Enter a character")
    var char: Char = readln()[0]

    for (i in 0..str.length-1) {
        if (str[i].equals(char, ignoreCase = false)) {
            count++

        }

    }
    if (count != 0) println("${str} \n $char is $count times") else print("$char not found")


}
