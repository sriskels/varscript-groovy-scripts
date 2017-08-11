import pl.daffit.dautils.api.*
chat = new DaChat("&9Test>")

workspace.command("hello", "", "", []) { sender, args ->
    chat.send(sender, "{PREFIX} &aHello world!")
}
