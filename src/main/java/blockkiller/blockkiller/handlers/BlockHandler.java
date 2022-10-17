package blockkiller.blockkiller.handlers;

import blockkiller.blockkiller.Blockkiller;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockHandler implements Listener {
    public BlockHandler(Blockkiller plugin){
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }
@EventHandler
public void onBlockPlace(BlockPlaceEvent event){
event.getPlayer().kickPlayer("ON CASSE PAS DES BLOCS ICI");
event.getBlock().setType(Material.AIR);
}
}
