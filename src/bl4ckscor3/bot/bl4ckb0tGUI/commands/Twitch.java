package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Twitch implements ICommand
{
	@Override
	public void exe()
	{
		Utilities.sendMessage(TabCommands.receiver, "http://www.twitch.tv/" + TabCommands.text[CommandPositions.twitch][0].getText());
	}
	
	@Override
	public String getAlias()
	{
		return "tv";
	}

	@Override
	public String getTooltip()
	{
		return "Sends the link to the Twitch channel you specified.";
	}
}
