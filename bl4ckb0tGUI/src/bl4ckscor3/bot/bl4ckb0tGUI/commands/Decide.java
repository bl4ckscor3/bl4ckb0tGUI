package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.IOException;
import java.util.Random;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Decide implements Command
{
	@Override
	public void exe() throws IOException
	{
		if(TabCommands.text[4][0].getText().endsWith("?"))
		{
			Random r = new Random();
			int decision = r.nextInt(101);

			if(decision >= 0 && decision <= 49)
				Utilities.sendMessage(TabCommands.receiver, "No!");
			else if(decision >= 50 && decision <= 100)
				Utilities.sendMessage(TabCommands.receiver, "Yes!");
			else
				Utilities.sendMessage(TabCommands.receiver, "I failed badly: " + decision);
		}
		else
			Utilities.sendMessage(TabCommands.receiver, "That's not a question! Maybe try using a questionmark? (Yes, I'm ocd about that :P)");
	}

	@Override
	public String getAlias() 
	{
		return "decide";
	}
}
