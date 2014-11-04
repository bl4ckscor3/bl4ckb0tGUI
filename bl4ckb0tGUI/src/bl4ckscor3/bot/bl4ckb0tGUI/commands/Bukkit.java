package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.pircbotx.Colors;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Bukkit implements ICommand
{
	@Override
	public void exe() throws IOException
	{
		String buffer = "x";
		String type = TabCommands.text[CommandPositions.bukkit][0].getText();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://dl.bukkit.org/downloads/bukkit/").openStream()));
		String[] link;
		String newUrl;
		String version;
		BufferedReader versionReader;

		switch(type)
		{
			case "rec":
				while((buffer = reader.readLine()) != null)
				{
					if(buffer.contains("downloadButton chan-rb  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						link = buffer.split("\"");

						//Code for the build version
						newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("bukkit.jar", "");
						versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();
						version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.DARK_GREEN + "The version of the latest recommended Bukkit build is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
					}
				}
				break;
			case "beta":
				while((buffer = reader.readLine()) != null)
				{
					if(buffer.contains("downloadButton chan-beta  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						link = buffer.split("\"");

						//Code for the build version
						newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("bukkit-beta.jar", "");
						versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();
						version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.PURPLE + "The version of the latest Bukkit Betabuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
					}
				}
				break;
			case "dev":
				while((buffer = reader.readLine()) != null)
				{
					if(buffer.contains("downloadButton chan-dev  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						link = buffer.split("\"");

						//Code for the build version
						newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("bukkit-dev.jar", "");
						versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();
						version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.RED + "The version of the latest Bukkit Devbuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
				break;
			default:
				System.out.println("Error: " + type);
		}
	}

	@Override
	public String getAlias()
	{
		return "bukkit";
	}
}
