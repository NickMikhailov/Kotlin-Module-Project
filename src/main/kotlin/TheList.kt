interface TheList :Screen {
    fun addNew()
    operator fun get(i: Int): Screen
}