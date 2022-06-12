package kr.ecse.catography

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryType

object Listener: Listener {
    @EventHandler
    fun makeMap(event: InventoryClickEvent, player: Player) {
        if(event.inventory.type == InventoryType.CARTOGRAPHY) {
            if(event.clickedInventory?.contains(Material.MAP) == true) {
                val map = event.currentItem
                player.sendMessage("$map")
            }
        }
    }
}