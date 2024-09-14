package com.aguela.Eventos;

import com.aguela.MensajeUtil.Mensaje;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Muerte implements Listener {
    @EventHandler
    public void playerDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        Location loc = player.getLocation();
        player.sendMessage(Mensaje.getMensaje("&2 Has muerto en las coordenadas"));
        player.sendMessage(Mensaje.getMensaje("&6x: "+loc.getBlockX()+" y: "+loc.getBlockY()+" z: "+loc.getBlockZ()));

    }
    @EventHandler
    public void playerZombie(PlayerDeathEvent event){
        Player player = event.getEntity();
        Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);

        zombie.setCustomName(player.getName());
        zombie.setCustomNameVisible(true);

        zombie.setCanPickupItems(true);
        zombie.setHealth(player.getHealth()/2);
    }

}
