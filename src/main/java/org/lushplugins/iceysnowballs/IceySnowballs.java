package org.lushplugins.iceysnowballs;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class IceySnowballs extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onSnowballHitPlayer(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() == EntityType.SNOWBALL) {
            event.getEntity().setFreezeTicks(100);
        }
    }
}
