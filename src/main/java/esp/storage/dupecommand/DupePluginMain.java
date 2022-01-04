package esp.storage.dupecommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class DupePluginMain extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("dupe").setExecutor(new dupeCommand());
    }
}
