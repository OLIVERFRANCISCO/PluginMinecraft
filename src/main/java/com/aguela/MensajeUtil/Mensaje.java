package com.aguela.MensajeUtil;

import org.bukkit.ChatColor;

public class Mensaje {
    public static String getMensaje(String mensaje) {
        return ChatColor.translateAlternateColorCodes('&', mensaje);
    }
}
