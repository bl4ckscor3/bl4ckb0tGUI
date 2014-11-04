package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.pircbotx.Colors;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class CraftBukkit implements ICommand
{
	@Override
	public void exe() throws IOException
	{
		String buffer = "x";
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://dl.bukkit.org/downloads/craftbukkit/").openStream()));

		switch(TabCommands.text[CommandPositions.craftbukkit][0].getText())
		{
			case "rec":
				for(int i = 0; i < 1301; i++)
				{
					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-rb  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						String[] link = buffer.split("\"");

						//Code for the Build version
						String newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("craftbukkit.jar", "");
						BufferedReader versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();

						String version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.DARK_GREEN + "The version of the latest recommended Craftbukkit build is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
				break;
			case "beta":
				for(int i = 0; i < 1301; i++)
				{
					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-beta  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						String[] link = buffer.split("\"");

						//Code for the Build version
						String newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("craftbukkit-beta.jar", "");
						BufferedReader versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();

						String version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.PURPLE + "The version of the latest Craftbukkit Betabuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
				break;
			case "dev":
				for(int i = 0; i < 1301; i++)
				{
					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-dev  mini"))
					{
						//Code for the DL-Link
						while(!buffer.contains("href"))
						{
							buffer = reader.readLine();
						}

						String[] link = buffer.split("\"");

						//Code for the Build version
						String newUrl = "http://dl.bukkit.org" + link[1].replace("get", "view").replace("craftbukkit-dev.jar", "");
						BufferedReader versionReader = new BufferedReader(new InputStreamReader(new URL(newUrl).openStream()));

						while(!buffer.contains("Version:"))
						{
							buffer = versionReader.readLine();
						}

						buffer = versionReader.readLine();
						buffer = versionReader.readLine();

						String version = buffer.substring(12);

						//Output
						Utilities.sendMessage(TabCommands.receiver, Colors.RED + "The version of the latest Craftbukkit Devbuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
				break;
			default:	
				System.out.println("Something went wrong: " + TabCommands.text[1][0].getText());
		}

		reader.close();
	}

	@Override
	public String getAlias()
	{
		return "cbukkit";
	}
}
