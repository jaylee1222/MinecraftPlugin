package blah.blahdeeblah.Listeners;

import blah.blahdeeblah.Blahdeeblah;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getServer;

public class ChatEventListener implements Listener {
    private Blahdeeblah plugin = Blahdeeblah.getPlugin(Blahdeeblah.class);

    @EventHandler
    public void onChatMessage(AsyncChatEvent e) {
        Player p = e.getPlayer();
        String msg = PlainTextComponentSerializer.plainText().serialize(e.message());
        getLogger().info(e.getPlayer().getName());
        getLogger().info(msg);
        if (msg.contains("hi")) {
            getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {
                e.getPlayer().kick(Component.text("Kicked"));
            });
        }
    }
}
