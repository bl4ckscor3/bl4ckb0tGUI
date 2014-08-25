package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class ChangeNick implements Command
{
	@Override
	public void exe() 
	{
		if(Core.gui.text[1][0].getText().equals("d"))
			Core.bot.sendIRC().changeNick("bl4ckb0t1");
		else
			Core.bot.sendIRC().changeNick(Core.gui.text[1][0].getText());
	}

	@Override
	public String getAlias() 
	{
		return "changenick";
	}
}
