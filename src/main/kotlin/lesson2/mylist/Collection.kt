
fun main(){

    val myList = MyList()
    val list = arrayListOf(5, 10, 56, 24, 93)

    myList.add(3)
    myList.addAll(list)

    println("get() = " + myList.get(2))

    myList.remove(93)

    myList.forEach {
        println(it)
    }

    println("Random element = " +myList.getRandomElement())


}
