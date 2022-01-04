package esp.storage.dupecommand.commands;

import esp.storage.dupecommand.enums.Config;
import esp.storage.dupecommand.DupePlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DupeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if(cmd.getName().equalsIgnoreCase("dupe")) {
            if(sender instanceof Player) {
                Player p = (Player) sender;
                if(p.hasPermission("dupeplugin.dupe")){
                    ItemStack hand = p.getInventory().getItemInMainHand();
                    p.getInventory().addItem(hand);
                    p.sendMessage(Config.PREFIX.getFormattedString() + Config.DUPED.getFormattedString());
                } else {
                    p.sendMessage(Config.PREFIX.getFormattedString() + Config.NO_PERMS.getFormattedString());
                }
            } else {
                DupePlugin.getInstance().getLogger().warning("You can't do this!");
            }
        }
        return false;
    }
}
