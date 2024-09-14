package com.aguela.Eventos;

import com.aguela.MensajeUtil.Mensaje;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.title.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.time.Duration;

public class EntrarServer implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.showTitle(Title.title(

                Component.text(Mensaje.getMensaje("&2&nBIENVENIDO A INKACRAFT V. ALFA")),
                Component.text("espero que se de tu agrado "+player.getName()),
                //establecer el tiempo
                Title.Times.times(
                        // tiempo para mostrarse
                        Duration.ofSeconds(1),
                        // tiempo de duracion del mensaje
                        Duration.ofSeconds(3),
                        // tiempo de salida
                        Duration.ofSeconds(1)
                )

        ));
    }
}
