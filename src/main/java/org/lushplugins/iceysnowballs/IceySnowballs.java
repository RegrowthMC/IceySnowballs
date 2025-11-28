package org.lushplugins.iceysnowballs;

import org.bukkit.plugin.java.JavaPlugin;

public final class IceySnowballs extends JavaPlugin {
    private static IceySnowballs plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static IceySnowballs getInstance() {
        return plugin;
    }
}
