
object NoteBook: TheList
{
    var noteBook: MutableList<Archive> = mutableListOf()

    override fun show() {
        println("Cписок архивов:")
        println("0. Создать новый архив")
        noteBook.forEachIndexed { index, archive ->
            println("${(index + 1).toString()}. ${archive.name}")
        }
        println((noteBook.size + 1).toString() + ". Выход")
        println("Введите номер пункта меню...")

        MenuHandler.handle(noteBook.size + 1, this)
    }

    override fun addNew(){
        println("Введите имя нового архива:")
        val name: String = readln()
        noteBook.add(Archive(name))
    }

    override fun get(i: Int): Screen {
        return noteBook[i]
    }
}