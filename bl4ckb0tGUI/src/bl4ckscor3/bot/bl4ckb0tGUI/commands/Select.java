package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.util.Random;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Select implements ICommand
{
	@Override
	public void exe()
	{
		String[] options = TabCommands.text[CommandPositions.select][0].getText().split(",");
		Random r = new Random();
		
		Utilities.sendMessage(TabCommands.receiver, options[r.nextInt(options.length)]);
	}
	
	@Override
	public String getAlias()
	{
		return "select";
	}
}
