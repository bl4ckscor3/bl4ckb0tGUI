package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class XColor implements ICommand
{
	@Override
	public void exe()
	{
		String[] colors =
			{
				"Grey",
				"Black",
				"Blue",
				"Dark Green",
				"Red",
				"Red",
				"Purple",
				"Brown",
				"Yellow",
				"Light Green",
				"Dark Aqua",
				"Lighter Aqua",
				"Pink"
			};

		for(int i = 0; i < 14; i++)
		{
			if(i < 4)
				Utilities.sendMessage(TabCommands.receiver, "%C" + i + ": " + colors[i]);
			else if(i > 4 && i < 12)
				Utilities.sendMessage(TabCommands.receiver, "%C" + i + ": " + colors[i]);
			else if(i == 13)
				Utilities.sendMessage(TabCommands.receiver, "%C" + i + ": " + colors[i - 1]);
		}
	}

	@Override
	public String getAlias() 
	{
		return "xcolor";
	}

}
