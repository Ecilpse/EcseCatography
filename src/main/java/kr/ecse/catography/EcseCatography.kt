package kr.ecse.catography

import org.bukkit.plugin.java.JavaPlugin

class EcseCatography: JavaPlugin() {
    override fun onEnable() {
        main = this
        //main.getCommand("catography")!!.setExecutor(Command())
        this.server.pluginManager.registerEvents(Listener, this)
        logger.info("ECSE Catography 활성화")
    }

    override fun onDisable() {
        logger.info("ECSE Catography 비활성화")
    }
}