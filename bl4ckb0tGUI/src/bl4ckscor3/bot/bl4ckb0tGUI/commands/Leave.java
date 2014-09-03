package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.IOException;

import org.pircbotx.Colors;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Leave implements ICommand
{
	@Override
	public void exe() throws IOException
	{
		if(!TabCommands.text[9][0].getText().startsWith("#"))
		{
			Utilities.sendMessage(TabCommands.receiver, "Channel names start with a hashtag (#)!");
			return;
		}
		
		if(Utilities.hasJoinedChannel(TabCommands.text[9][0].getText()))
		{
			Utilities.sendMessage(TabCommands.receiver, "I will leave the channel " + Colors.BOLD + TabCommands.text[9][0].getText());
			Core.bot.sendRaw().rawLine("PART " + TabCommands.text[9][0].getText() + " :My master told me that I can't be here anymore :C");
		}
		else
			Utilities.sendMessage(TabCommands.receiver, "I'm not in that channel.");
	}

	@Override
	public String getAlias()
	{
		return "leave";
	}
}
