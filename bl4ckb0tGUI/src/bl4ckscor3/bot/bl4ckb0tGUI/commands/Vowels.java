package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Vowels implements ICommand
{
	@Override
	public void exe()
	{
		char[] chars = TabCommands.text[CommandPositions.vowels][0].getText().toLowerCase().toCharArray();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < chars.length; i++)
		{
			switch(chars[i])
			{
				case 'a': builder.append(""); break;
				case 'e': builder.append(""); break;
				case 'i': builder.append(""); break;
				case 'o': builder.append(""); break;
				case 'u': builder.append(""); break;
				default: builder.append(chars[i]);
			}
		}
		
		Utilities.sendMessage(TabCommands.receiver, builder.toString());
	}
	
	@Override
	public String getAlias()
	{
		return "vowels";
	}
}
