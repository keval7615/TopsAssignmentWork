//* String questions
fun main() {


//* 1.check str is palindrome or not

    var str: String = "vov"
    var str1: String = "volov"

    if (str.reversed().equals(str)) "it's palindrom" else "not palindrom"

//* 2.cout a num of vowel in str
    str = "Kotlin"
    var count = 0

    var arr = str.toCharArray()
    for (i in arr) {
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
            count++
        }
    }
    println(count)

//* 3.check if 2 str is anagrams.
//arc = car
    var word1 = "arc"
    var word2 = "car"
    var sw1 = word1.toCharArray().sort()
    var sw2 = word2.toCharArray().sort()
    println(if (sw1.equals(sw2)) "is anagrams" else "is not")

//* 4.remove all duplicate char in str
    var duplicayte = "aeeddbbss"
    var nondupli = duplicayte.toSet()
    println(nondupli)


//* 5.count number of words in str
    var sintance = "I am superman"

    var wc = sintance.split(" ").count()

    println(wc)

//* 6.replace all spaces in str with %20

    var string1 = " xi is tools "
    var z = string1.replace( " ","%20")
    println(z)


//* 7.check if string contains all unique character
    var newstr = "wer"
    var arr0 = newstr.toSet().toCharArray()
    var arr2 = newstr.toCharArray()
    println(arr0)
    println(arr2)
    println(if (arr0.contentEquals(arr2)) " all are uniqe " else "not unique" )


//* 8.check if str valid num or not

    fun valadityOfName(str:String):Pair<String,Boolean>
    {

        var q =  Pair(str,str.length<8)
        println(" name is ${q.first} ${if (q.second) "is valid" else "is invalid"}")
        return q

    }
    println("${valadityOfName("zamuraert")}")
}