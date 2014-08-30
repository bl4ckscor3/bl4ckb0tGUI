package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Bukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ChangeNick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Command;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.CraftBukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Decide;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;


public class MainListener implements ActionListener
{
	private LinkedList<Command> commands = new LinkedList();
	public static WarningGui warningGui;
	
	public MainListener()
	{
		commands.add(new Bukkit());
		commands.add(new Calculate());
		commands.add(new ChangeNick());
		commands.add(new CraftBukkit());
		commands.add(new Decide());
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		for(Command c : commands)
		{
			if(("Issue '-" + c.getAlias() + "'").equalsIgnoreCase(event.getActionCommand()))
			{
				Core.gui.receiver = Core.dev ? "#bl4ckb0tTest" : Core.gui.text[Core.gui.text.length - 1][0].getText();
				
				try
				{
					if(!c.getAlias().equals("changenick"))
						Utilities.sendMessage(Core.gui.receiver, Core.name + " issued this command: -" + c.getAlias() + " ");
					
					c.exe();
				}
				catch(IOException e){}
				catch(IllegalArgumentException e)
				{
					warningGui = new WarningGui();
					
					warningGui.setTitle("WARNING");
					warningGui.setFont(new Font("Arial", 0, 14));
					warningGui.setSize(300, 150);
					warningGui.setLocationRelativeTo(null);
					warningGui.setResizable(false);
					warningGui.setVisible(true);
				}

				return;
			}
		}
		System.out.println("Something went wrong.");
	}
}
