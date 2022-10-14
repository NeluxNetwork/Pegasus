package dev.selixe

import dev.selixe.utils.CC
import net.minecraft.server.v1_8_R3.IChatBaseComponent
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class Pegasus : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
    }

    
    fun sendTab(player: Player, title: String, footer: String) {
        newTab(player, CC.translate(title), CC.translate(footer))
    }

    private fun newTab(p: Player, header: String?, footer: String?) {
        var header = header
        var footer = footer
        if (header == null) header = ""
        if (footer == null) footer = ""
        val tabHeader = IChatBaseComponent.ChatSerializer.a("{\"text\":\"$header\"}")
        val tabFooter = IChatBaseComponent.ChatSerializer.a("{\"text\":\"$footer\"}")
        val headerPacket = PacketPlayOutPlayerListHeaderFooter(tabHeader)
        try {
            val field = headerPacket.javaClass.getDeclaredField("b")
            field.isAccessible = true
            field[headerPacket] = tabFooter
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            (p as CraftPlayer).handle.playerConnection.sendPacket(headerPacket)
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
