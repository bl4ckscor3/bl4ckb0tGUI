package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Bukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ChangeNick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.CraftBukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Decide;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Draw;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Forge;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ICommand;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Join;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Kick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Leave;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Leet;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.LongURL;
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
			System.out.println("Something went wrong.");
		}
	}
}
