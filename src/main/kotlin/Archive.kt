
class Archive(var name: String): TheList
{
    var notes: MutableList<Note> = mutableListOf()

    override fun show () {
        println("Архив: \"" + name + "\"")
        println("Cписок заметок:")
        println("0. Создать новую заметку")
        notes.forEachIndexed { index, note ->
            println("${(index+1).toString()}. ${note.name}")
        }
        println((notes.size+1).toString() + ". Выход")
        println("Введите номер пункта меню...")

        MenuHandler.handle(notes.size+1, this)
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