package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Kick implements ICommand
{
	@Override
	public void exe() throws IOException
	{
		boolean allowed = false;
		boolean found = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.dropbox.com/s/0flrfzw3ljmw3u2/allowedUsers.txt").openStream()));
		String[] allowedUsers = reader.readLine().split(",");

		for(String allowedUser : allowedUsers)
		{
			if(Core.name.equals(allowedUser))
			{	
				allowed = true;
				break;
			}
		}

		for(String allowedUser : Utilities.getValidUsers())
		{
			if(Core.name.equalsIgnoreCase(allowedUser))
			{
				allowed = true;
				break;
			}
		}

		if(!allowed)
		{
			Utilities.sendMessage(TabCommands.receiver, "Sorry, " + Core.name + ", you're not authorized to kick people from this channel.");
			return;
		}

		for(String userNotToKick : Utilities.getValidUsers())
		{
			if(TabCommands.text[CommandPositions.kick][0].getText().equalsIgnoreCase(userNotToKick))
			{
				found = true;
				break;
			}
		}

		if(!found)
		{
			if(TabCommands.text[CommandPositions.kick][0].getText().equalsIgnoreCase(Core.bot.getNick()))
			{
				Core.bot.sendIRC().action(TabCommands.receiver, "kicks himself");
				Core.bot.sendRaw().rawLine("KICK " + TabCommands.receiver + " " + TabCommands.text[CommandPositions.kick][0].getText() + " :I'm said now :(");
			}
			else
				Core.bot.sendRaw().rawLine("KICK " + TabCommands.receiver + " " + TabCommands.text[CommandPositions.kick][0].getText() + " :" + TabCommands.text[CommandPositions.kick][1].getText());
		}
		else
			Utilities.sendMessage(TabCommands.receiver, "This user cannot be kicked.");
	}

	@Override
	public String getAlias()
	{
		return "kick";
	}
	

	@Override
	public String getTooltip()
	{
		return "Kicks a user.";
	}
}
