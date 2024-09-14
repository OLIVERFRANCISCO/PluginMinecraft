package com.aguela.Eventos;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvocarWhiter implements Listener {
    @EventHandler
    public void invocarWhiter(EntitySpawnEvent e) {
        if(e.getEntityType() == EntityType.WITHER) {
            Entity whiter = e.getEntity();
            whiter.setCustomName("Whiter Modificado");
            whiter.setCustomNameVisible(true);


        }
    }
}
