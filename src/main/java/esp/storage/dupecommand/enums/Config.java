package esp.storage.dupecommand.enums;

import esp.storage.dupecommand.DupePlugin;
import net.md_5.bungee.api.ChatColor;

import java.util.List;

public enum Config {

    PREFIX(".prefix"),
    NO_PERMS(".messages.no-perms"),
    DUPED(".messages.item-duped");

    private final String path;

    Config(String path) {
        this.path = path;
    }

    public boolean getBoolean() {
        return DupePlugin.getInstance().getConfig().getBoolean(path);
    }

    public String getFormattedString() {
        return ChatColor.translateAlternateColorCodes('&', DupePlugin.getInstance().getConfig().getString(path));
    }

    public String getString() {
        return DupePlugin.getInstance().getConfig().getString(path);
    }

    public int getInt() {
        return DupePlugin.getInstance().getConfig().getInt(path);
    }

    public List<String> getStringList() {
        return DupePlugin.getInstance().getConfig().getStringList(path);
    }

    public static String getFormattedString(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}
