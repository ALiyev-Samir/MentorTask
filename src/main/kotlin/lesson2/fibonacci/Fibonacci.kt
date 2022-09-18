package Lesson2.fibonacci

import java.util.*

fun main(){
    println("Elementin sıra nömrəsin daxil edin.")


    val scan = Scanner(System.`in`)
    val index = scan.nextInt()

    getElementByIndex(index)

    println()
    main()
}

fun getElementByIndex(index: Int){
    var f0 = 0
    var f1 = 1
    var i = 2
    var currentF = 0

    println(f0)
    println(f1)

    while(i != index){
        currentF = f0 + f1
        println(currentF)
        f0 = f1
        f1 = currentF
        i++
    }
}