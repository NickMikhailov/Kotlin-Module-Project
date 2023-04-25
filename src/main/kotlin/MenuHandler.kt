import java.lang.Exception

object MenuHandler {

     private fun input(i: Int): Int {
        while (true){
            try {
                val input = readln().toInt()
                if (input in 0..i) return input
                else println ("Такого пункта в меню нет. Введите номер пункта меню:")
            } catch (e: Exception) {
                println("Вы не ввели число. Введите номер пункта меню.")
            }
        }
    }

    fun handle(i: Int, theList: TheList)
    {
        val selection = input(i)
        when(selection){
            0 -> theList.addNew()
            in 1..(i-1) -> theList[selection-1].show()
            else -> return
        }
        theList.show()
    }
}




