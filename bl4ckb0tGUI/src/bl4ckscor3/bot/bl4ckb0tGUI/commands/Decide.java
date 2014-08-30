package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.IOException;
import java.util.Random;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Decide implements Command
{
	@Override
	public void exe() throws IOException
	{
		if(Core.gui.text[4][0].getText().endsWith("?"))
		{
			Random r = new Random();
			int decision = r.nextInt(101);

			if(decision >= 0 && decision <= 49)
				Utilities.sendMessage(Core.gui.receiver, "No!");
			else if(decision >= 50 && decision <= 100)
				Utilities.sendMessage(Core.gui.receiver, "Yes!");
			else
				Utilities.sendMessage(Core.gui.receiver, "I failed badly: " + decision);
		}
		else
			Utilities.sendMessage(Core.gui.receiver, "That's not a question! Maybe try using a questionmark? (Yes, I'm ocd about that :P)");
	}

	@Override
	public String getAlias() 
	{
		return "decide";
	}
}
