package dev.selixe.utils

import lombok.experimental.UtilityClass
import org.bukkit.ChatColor
import java.util.function.Function
import java.util.stream.Collectors

@UtilityClass
object CC {
    var NO_CONSOLE = translate("&cThis is a player only command.")
    var NO_PERM = translate("&cYou don't have enough permissions.")
    var BLUE: String? = null
    var AQUA: String? = null
    var YELLOW: String? = null
    var RED: String? = null
    var GRAY: String? = null
    var GOLD: String? = null
    var GREEN: String? = null
    var WHITE: String? = null
    var BLACK: String? = null
    var BOLD: String? = null
    var ITALIC: String? = null
    var UNDER_LINE: String? = null
    var STRIKE_THROUGH: String? = null
    var RESET: String? = null
    var MAGIC: String? = null
    var DARK_BLUE: String? = null
    var DARK_AQUA: String? = null
    var DARK_GRAY: String? = null
    var DARK_GREEN: String? = null
    var DARK_PURPLE: String? = null
    var DARK_RED: String? = null
    var PINK: String? = null

    fun translate(input: String?): String {
        return ChatColor.translateAlternateColorCodes('&', input!!)
    }

    fun translate(input: List<String?>): List<String> {
        return input.stream().map(Function<String?, String> { obj: String? -> translate() })
            .collect(Collectors.toList())
    }

    private fun translate(): String? {
        TODO("Not yet implemented")
    }

    init {
        BLUE = ChatColor.BLUE.toString()
        AQUA = ChatColor.AQUA.toString()
        YELLOW = ChatColor.YELLOW.toString()
        RED = ChatColor.RED.toString()
        GRAY = ChatColor.GRAY.toString()
        GOLD = ChatColor.GOLD.toString()
        GREEN = ChatColor.GREEN.toString()
        WHITE = ChatColor.WHITE.toString()
        BLACK = ChatColor.BLACK.toString()
        BOLD = ChatColor.BOLD.toString()
        ITALIC = ChatColor.ITALIC.toString()
        UNDER_LINE = ChatColor.UNDERLINE.toString()
        STRIKE_THROUGH = ChatColor.STRIKETHROUGH.toString()
        RESET = ChatColor.RESET.toString()
        MAGIC = ChatColor.MAGIC.toString()
        DARK_BLUE = ChatColor.DARK_BLUE.toString()
        DARK_AQUA = ChatColor.DARK_AQUA.toString()
        DARK_GRAY = ChatColor.DARK_GRAY.toString()
        DARK_GREEN = ChatColor.DARK_GREEN.toString()
        DARK_PURPLE = ChatColor.DARK_PURPLE.toString()
        DARK_RED = ChatColor.DARK_RED.toString()
        PINK = ChatColor.LIGHT_PURPLE.toString()
    }
}