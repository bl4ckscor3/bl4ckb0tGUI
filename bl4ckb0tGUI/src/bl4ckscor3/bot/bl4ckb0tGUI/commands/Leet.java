package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Leet implements ICommand
{
	@Override
	public void exe()
	{
		char[] chars = TabCommands.text[10][0].getText().toCharArray();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < chars.length; i++)
		{
			switch(chars[i])
			{
				case 'A': case 'a': builder.append("4"); break;
				case 'E': case 'e': builder.append("3"); break;
				case 'G': case 'g': builder.append("6"); break;
				case 'H': case 'h': builder.append("h"); break;
				case 'I': case 'i': builder.append("1"); break;
				case 'L': case 'l': builder.append("|"); break;
				case 'S': case 's': builder.append("5"); break;
				case 'T': case 't': builder.append("7"); break;
				case 'Z': case 'z': builder.append("2"); break;
				default: builder.append(chars[i]);
			}
		}
		Utilities.sendMessage(TabCommands.receiver, builder.toString());
	}
	
	@Override
	public String getAlias()
	{
		return "leet";
	}
}
