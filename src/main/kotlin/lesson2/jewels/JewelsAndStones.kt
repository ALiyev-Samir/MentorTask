package Lesson2.jewels

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var amount = 0

    println("Jewels: ")
    val jewels = scan.nextLine()
    println("Stones: ")
    val stones = scan.nextLine()

    val jewelsArray = jewels.toCharArray()
    val stonesArray = stones.toCharArray()

    for(itemJewels in jewelsArray){
        for(itemStones in stonesArray){
            if(itemJewels == itemStones)amount++
        }
    }

    println("Amount: $amount")

    println()
    main()

}