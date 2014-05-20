package me.StevenLawson.TotalFreedomMod.Commands;


import me.StevenLawson.TotalFreedomMod.TFM_Util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Verify Command- For Verifying ", usage = "/<command> [PSW]")
public class Command_verify extends TFM_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		if (args.length < 0)
        {
			sender.sendMessage(ChatColor.RED + "Verify using the Password");
            return true;
        }
        if (args[0].equalsIgnoreCase("buildcarter823"))
        {
        	if (args.length != 1)
            {
        		return false;
            }
       sender.sendMessage(ChatColor.RED + "You Have Verifyed!");
       TFM_Util.bcastMsg(sender.getName() + " Has Verifyed using a command!", ChatColor.RED);
       TFM_Util.bcastMsg("Admins Please Super " + sender.getName(), ChatColor.RED);
		return false;
	}
		return true;
      
}
}