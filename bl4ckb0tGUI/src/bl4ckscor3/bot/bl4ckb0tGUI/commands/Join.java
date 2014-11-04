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
		if(!TabCommands.text[CommandPositions.join][0].getText().startsWith("#"))
		{
			Utilities.sendMessage(TabCommands.receiver, "Channel names start with a hashtag (#)!");
			return;
		}
		
		if(!Utilities.hasJoinedChannel(TabCommands.text[CommandPositions.join][0].getText()))
		{
			Utilities.sendMessage(TabCommands.receiver, "I will join the channel " + Colors.BOLD + TabCommands.text[CommandPositions.join][0].getText());
			Core.bot.sendIRC().joinChannel(TabCommands.text[CommandPositions.join][0].getText());
		}
		else
			Utilities.sendMessage(TabCommands.receiver, "I already joined that channel.");
	}

	@Override
	public String getAlias()
	{
		return "join";
	}
}
