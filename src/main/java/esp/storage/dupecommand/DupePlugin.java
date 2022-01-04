package esp.storage.dupecommand;

import esp.storage.dupecommand.commands.DupeCommand;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class DupePlugin extends JavaPlugin {

    @Getter private static DupePlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        loadConfig();
        registerCommands();
    }

    private void registerCommands() {
        getCommand("dupe").setExecutor(new DupeCommand());
    }

    private void loadConfig() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();
    }

}
