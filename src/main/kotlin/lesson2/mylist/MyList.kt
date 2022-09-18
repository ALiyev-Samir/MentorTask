class MyList: ArrayList<Int>() {
    override fun add(element: Int): Boolean {
        return super.add(element)
    }

    override fun addAll(elements: Collection<Int>): Boolean {
        return super.addAll(elements)
    }

    override fun remove(element: Int): Boolean {
        return super.remove(element)
    }

    override fun get(index: Int): Int {
        return super.get(index)
    }

    fun getRandomElement(): Int{
        return super.get((Math.random()*super.size).toInt())
    }
}