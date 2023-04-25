
class Archive(var name: String): TheList
{
    var notes: MutableList<Note> = mutableListOf()

    override fun show () {
        println("Архив: \"" + name + "\"")
        println("Cписок заметок:")
        println("0. Создать новую заметку")
        var i = 1
        for (note in notes) {
            println((i++).toString()+". "+ note.name)
        }
        println(i.toString() + ". Выход")
        println("Введите номер пункта меню...")

        MenuHandler.handle(i, this)
    }


    override fun addNew (){
        println("Введите имя новой заметки:")
        val name: String = readln()
        println("Введите текст новой заметки:")
        val text: String = readln()

        notes.add(Note(name, text))
    }

    override fun get(i: Int): Screen {
        return notes[i]
    }
}