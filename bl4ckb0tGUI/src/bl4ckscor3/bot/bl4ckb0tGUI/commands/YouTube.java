package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class YouTube implements ICommand
{
	@Override
	public void exe()
	{
		Utilities.sendMessage(TabCommands.receiver, "http://www.youtube.com/" + TabCommands.text[21][0].getText());
	}

	@Override
	public String getAlias()
	{
		return "yt";
	}
}