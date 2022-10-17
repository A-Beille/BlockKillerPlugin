package blockkiller.blockkiller;

import blockkiller.blockkiller.handlers.BlockHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Blockkiller extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
new BlockHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
