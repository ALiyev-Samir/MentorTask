package Lesson2.polindrom

import java.util.*

fun main(){
    println("4 rəqəmli ədəd daxil edin.")
    var number: Short = 0
    val scan = Scanner(System.`in`)

    try {
        number = scan.nextShort()
        if(number<1000 || number>9999){
            println("Daxil edilən parametr yanlışdır.")
            main()
        }
    }
    catch (e: Exception){
        println("Daxil edilən parametr yanlışdır.")
        main()
    }


    if(checkForPalindrome(number))println("Ədəd polindrumdur.")
    else println("Ədəd polindrum deyil.")


    println()
    main()

}

fun checkForPalindrome(number: Short): Boolean{
    //var reverseNumer: Short = 0
    var reverseNumer = ""
    var num = number.toInt()

    while(num != 0){
        reverseNumer += num % 10
        num /= 10
    }

    if(number == reverseNumer.toShort()) return true

    return false


}