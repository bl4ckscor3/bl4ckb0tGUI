package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class ChangeNick implements Command
{
	@Override
	public void exe() 
	{
		if(Core.gui.text[3][0].getText().equals("d"))
			Core.bot.sendIRC().changeNick("bl4ckb0t");
		else
			Core.bot.sendIRC().changeNick(Core.gui.text[2][0].getText());
	}

	@Override
	public String getAlias() 
	{
		return "changenick";
	}
}
