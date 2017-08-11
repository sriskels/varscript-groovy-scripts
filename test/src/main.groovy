import pl.daffit.dautils.api.*
chat = new DaChat("&9Test>")

workspace.command("hello", "", "", []) { sender, args ->
    (sender as Player).give(new DaItem("STONE", 1).withName("&7Hello world!").build())
    chat.send(sender, "{PREFIX} &aHello world! :D")
}
