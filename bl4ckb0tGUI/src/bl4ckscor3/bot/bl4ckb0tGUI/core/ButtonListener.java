package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Bukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ChangeNick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Command;


public class ButtonListener implements ActionListener
{
	private LinkedList<Command> commands = new LinkedList();

	public ButtonListener()
	{
		commands.add(new Bukkit());
		commands.add(new ChangeNick());
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		for(Command c : commands)
		{
			if(("Issue '-" + c.getAlias() + "'").equalsIgnoreCase(event.getActionCommand()))
			{
				Core.gui.receiver = Core.gui.text[Core.gui.text.length - 1][0].getText();
				
				try
				{
					c.exe();
				}
				catch (IOException e){}
				
				return;
			}
		}
		System.out.println("Something went wrong.");
	}
}
