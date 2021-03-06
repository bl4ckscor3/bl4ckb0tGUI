package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class LongURL implements ICommand
{
	@Override
	public void exe() 
	{
		try
		{
			String longUrl = "";
			String temp;
			BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://api.longurl.org/v2/expand?url=" + TabCommands.text[CommandPositions.longurl][0].getText()).openStream()));

			reader.readLine();
			reader.readLine();
			longUrl = reader.readLine();
			temp = longUrl;
			longUrl = "http:" + temp.split(":")[1].split("]")[0];

			Utilities.sendMessage(TabCommands.receiver, "This is the long url of the given link: " + longUrl);
		}
		catch(Exception e){}
	}
	@Override
	public String getAlias() 
	{
		return "longurl";
	}

	@Override
	public String getTooltip()
	{
		return "Retrives the url behind a short link (http://bit.ly/dc8fo1c for example)";
	}
}
