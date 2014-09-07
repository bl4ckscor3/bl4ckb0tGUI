package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.*;
import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class CommandButtonListener implements ActionListener
{
	private LinkedList<ICommand> commands = new LinkedList();
	public static boolean enabled = true;

	public CommandButtonListener()
	{
		commands.add(new Bukkit());
		commands.add(new Calculate());
		commands.add(new ChangeNick());
		commands.add(new CraftBukkit());
		commands.add(new Decide());
		commands.add(new Draw());
		commands.add(new Forge());
		commands.add(new Join());
		commands.add(new Kick());
		commands.add(new Leave());
		commands.add(new Leet());
		commands.add(new LongURL());
		commands.add(new RandomLetter());
		commands.add(new RandomNumber());
		commands.add(new Scramble());
		commands.add(new Select());
		commands.add(new Twitch());
		commands.add(new Twitter());
		commands.add(new Vowels());
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(enabled)
		{
			for(ICommand c : commands)
			{
				if(("Issue '-" + c.getAlias() + "'").equalsIgnoreCase(event.getActionCommand()))
				{
					TabCommands.receiver = Core.dev ? "#bl4ckb0tTest" : TabCommands.text[TabCommands.text.length - 1][0].getText();

					try
					{
						if(!c.getAlias().equals("changenick"))
							Utilities.sendMessage(TabCommands.receiver, Core.name + " issued this command: -" + c.getAlias() + " ");
						
						c.exe();
					}
					catch(IOException e){}
					catch(IllegalArgumentException e)
					{
						new WarningGui("No target set!", "You need to specify a target!");
					}	
					return;
				}
			}
			System.out.println("Something went wrong. Maybe the command you're trying to issue is not added to the commands list yet?");
		}
	}
}
