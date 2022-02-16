package blah.blahdeeblah;

import blah.blahdeeblah.Listeners.ChatEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Blahdeeblah extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChatEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
