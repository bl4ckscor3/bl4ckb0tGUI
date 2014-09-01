package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;

public class ChangeNick implements ICommand
{
	@Override
	public void exe() 
	{
		if(TabCommands.text[3][0].getText().equals("d"))
			Core.bot.sendIRC().changeNick("bl4ckb0t");
		else
			Core.bot.sendIRC().changeNick(TabCommands.text[3][0].getText());
	}

	@Override
	public String getAlias() 
	{
		return "changenick";
	}
}
