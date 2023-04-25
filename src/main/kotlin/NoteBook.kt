
object NoteBook: TheList
{
    var noteBook: MutableList<Archive> = mutableListOf()

    override fun show() {
        println("Cписок архивов")
        println("0. Создать новый архив")
        var i = 1
        for (archive in noteBook) {
            println((i++).toString() +". "+ archive.name)
        }
        println(i.toString() + ". Выход")
        MenuHandler.handle(i, this)
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