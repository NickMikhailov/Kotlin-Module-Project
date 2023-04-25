
class Note (
    var name: String = String(),
    var text: String = String()
    ): Screen
    {
    override fun show () {
        println("\nЗаметка " + name +":\n" + text + "\n\nДля выхода нажмите Enter...")
        readln()
    }
}