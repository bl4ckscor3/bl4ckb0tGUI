package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.util.Random;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Scramble implements ICommand
{
	private Random r = new Random();
	private String[][] actions = 
		{
		 new String[]{"R", "R'", "R2"}, 
		 new String[]{"L", "L'", "L2"}, 
		 new String[]{"D", "D'", "D2"}, 
		 new String[]{"U", "U'", "U2"}, 
		 new String[]{"F", "F'", "F2"}, 
		 new String[]{"B", "B'", "B2"}
		};
	public static int[] scrambleAmounts = 
		{
		 20,
		 25,
		 30,
		 35,
		 40
		};
	
	@Override
	public void exe()
	{
			String[] results = new String[(int)TabCommands.dropDown[2].getSelectedItem()];
			StringBuilder builder = new StringBuilder();

			for(int i = 0; i < results.length; i++)
			{
				results[i] = (actions[r.nextInt(actions.length)][r.nextInt(3)]);
			}

			for(int i = 0; i < results.length - 2; i++)
			{
				compareJumping(results, i);
			}
			
			//comparing the last two ones (preventing an aioob exception in the for loop above)
			compareDirectly(results, results.length - 2);
			
			for(String s : results)
			{
				builder.append(s + " ");
			}

			Utilities.sendMessage(TabCommands.receiver, builder.toString());
	}
	
	private void compareDirectly(String[] results, int i)
	{
		//compare if both values are in the same array
		if(getFirstLetter(results[i]).equals(getFirstLetter(results[i + 1])))
		{
			reRoll(results, i + 1); //reroll if so
			compareDirectly(results, i); //revalidate in case it re-rolls to the same array value
		}
	}
	
	private void compareJumping(String[] results, int i)
	{
		//compare if both values are in the same array
		if(getFirstLetter(results[i]).equals(getFirstLetter(results[i + 2])))
		{
			reRoll(results, i + 2); //reroll if so
			compareJumping(results, i); //revalidate in case it re-rolls to the same array value
		}
		
		//make sure the above code didn't screw up
		compareDirectly(results, i);
	}

	private String getFirstLetter(String value)
	{
		return value.substring(0, 1);
	}

	private void reRoll(String[] results, int i)
	{
		results[i] = (actions[r.nextInt(actions.length)][r.nextInt(3)]);
	}

	@Override
	public String getAlias()
	{
		return "scramble";
	}

	@Override
	public String getTooltip()
	{
		return "Gives you a scrambling algorythm for your 3x3 Rubik's Cube.";
	}
}
