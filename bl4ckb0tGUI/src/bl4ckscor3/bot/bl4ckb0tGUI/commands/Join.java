package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.IOException;

import org.pircbotx.Colors;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Join implements ICommand
{
	@Override
	public void exe() throws IOException
	{
		String channel = TabCommands.text[CommandPositions.leave][0].getText().startsWith("#") ? TabCommands.text[CommandPositions.leave][0].getText() : "#" + TabCommands.text[CommandPositions.leave][0].getText();
		
		if(!Utilities.hasJoinedChannel(channel))
		{
			Utilities.sendMessage(TabCommands.receiver, "I will join the channel " + Colors.BOLD + channel);
			Core.bot.sendIRC().joinChannel(channel);
		}
		else
			Utilities.sendMessage(TabCommands.receiver, "I already joined that channel.");
	}

	@Override
	public String getAlias()
	{
		return "join";
	}

	@Override
	public String getTooltip()
	{
		return "The bot joins the given channel.";
	}
}
