package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ChangeNick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Decide;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Draw;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Forge;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ICommand;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Join;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Kick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Leave;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Leet;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.LongURL;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.RandomLetter;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.RandomNumber;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Scramble;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Select;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Twitch;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Twitter;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Vowels;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Weather;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.XColor;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.YouTube;
import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class CommandButtonListener implements ActionListener
{
	public static ArrayList<ICommand> commands = new ArrayList<ICommand>();
	public static boolean enabled = true;

	public CommandButtonListener()
	{
		//adding all available commands to a linked list to be able to access them easily
		commands.add(new Calculate());
		commands.add(new ChangeNick());
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
		commands.add(new Weather());
		commands.add(new XColor());
		commands.add(new YouTube());
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(enabled)
		{
			int i = 0;
			
			//looping through the commands and searching for the right command to execute
			for(ICommand c : commands)
			{
				if(("Issue '-" + c.getAlias() + "'").equalsIgnoreCase(event.getActionCommand()))
				{
					//set the channel to send to - if the program is in development, send it to #bl4ckb0tTest, else send it to whatever the user inputs
					TabCommands.receiver = Core.dev ? "#bl4ckb0tTest" : TabCommands.text[TabCommands.text.length - 1][0].getText();

					try
					{
						//putting all the arguments together to notify users in the channel who issued what commando
						if(!c.getAlias().equals("changenick"))
						{
							String command = c.getAlias() + " ";
							
							for(JTextField txt : TabCommands.text[i])
							{
								command += txt.getText() + " ";
							}
							
							Utilities.sendMessage(TabCommands.receiver, Core.name + " issued this command: -" + command);
						}
						
						c.exe();
					}
					catch(IOException e){}
					catch(IllegalArgumentException e)
					{
						new WarningGui("No target set!", "You need to specify a target!");
					}	
					return;
				}
				
				i++;
			}
			System.out.println("Something went wrong. Maybe the command you're trying to issue is not added to the commands list yet?");
		}
	}
}
