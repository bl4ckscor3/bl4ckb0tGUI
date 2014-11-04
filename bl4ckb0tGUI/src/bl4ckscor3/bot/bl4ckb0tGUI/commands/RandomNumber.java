package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.util.Random;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class RandomNumber implements ICommand
{
	@Override
	public void exe()
	{
		StringBuilder output = new StringBuilder();
		int[] numbs = new int[50];
		int n = Integer.parseInt(TabCommands.text[CommandPositions.number][0].getText());

			if(!(n > 50))
			{
				Random r = new Random();

				for(int i = 0; i < n; i++)
				{
					numbs[i] = r.nextInt(10);
					output.append(numbs[i]).append(" ");
				}

				Utilities.sendMessage(TabCommands.receiver, output.toString());
			}
	}
	
	@Override
	public String getAlias()
	{
		return "number";
	}
}
