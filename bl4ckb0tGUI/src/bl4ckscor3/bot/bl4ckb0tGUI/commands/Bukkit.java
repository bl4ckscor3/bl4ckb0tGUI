package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.pircbotx.Colors;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Bukkit implements Command
{
	@Override
	public void exe() throws IOException
	{
		String buffer = "x";
		String type = Core.gui.text[0][0].getText();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://dl.bukkit.org/downloads/bukkit/").openStream()));

		switch(type)
		{
			case "rec":
				for(int i = 0; i < 1301; i++)
				{
					String[] link;
					String newUrl;
					String version;
					BufferedReader versionReader;

					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-rb mini"))
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
						Utilities.sendMessage(Core.gui.receiver, Colors.DARK_GREEN + "the version of the latest recommended Bukkit build is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
			case "beta":
				for(int i = 0; i < 1301; i++)
				{
					String[] link;
					String newUrl;
					String version;
					BufferedReader versionReader;

					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-beta mini"))
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
						Utilities.sendMessage(Core.gui.receiver, Colors.PURPLE + "the version of the latest Bukkit Betabuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
			case "dev":
				for(int i = 0; i < 1301; i++)
				{
					String[] link;
					String newUrl;
					String version;
					BufferedReader versionReader;

					buffer = reader.readLine();

					if(buffer.contains("downloadButton chan-dev mini"))
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
						Utilities.sendMessage(Core.gui.receiver, Colors.RED + "the version of the latest Bukkit Devbuild is " + Colors.BOLD + version + Colors.BOLD + ". Download it here: " + Colors.BOLD + "http://dl.bukkit.org" + link[1]);
						versionReader.close();
						break;
					}
				}
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
