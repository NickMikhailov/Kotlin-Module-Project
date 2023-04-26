import java.lang.Exception

object MenuHandler {

     private fun input(menuSize: Int): Int {
        while (true){
            try {
                val input = readln().toInt()
                if (input in 0..menuSize) return input
                else println ("Такого пункта в меню нет. Введите номер пункта меню:")
            } catch (e: Exception) {
                println("Вы не ввели число. Введите номер пункта меню.")
            }
        }
    }

    fun handle(menuSize: Int, theList: TheList)
    {
        when(val selection = input(menuSize)){
            0 -> theList.addNew()
            in 1 until menuSize -> theList[selection-1].show()
            else -> return
        }
        theList.show()
    }
}




