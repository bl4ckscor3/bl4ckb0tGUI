package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Forge implements ICommand
{
	@Override
	public void exe() throws IOException
	{
			if(TabCommands.text[CommandPositions.forge][0].getText().equalsIgnoreCase("latets") || TabCommands.text[CommandPositions.forge][0].getText().equalsIgnoreCase("latest"))
			{
				if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("version"))
				{
					String result = createResult("<td>Latest</td>", "Version");

					if(result.equalsIgnoreCase(createResult("<td>Recommended</td>", "Version")))
						Utilities.sendMessage(TabCommands.receiver,  result + " This is also the recommended build.");
					else
						Utilities.sendMessage(TabCommands.receiver, result);
				}
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("changelog"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Latest</td>", "Changelog"));
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("dlmain"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Latest</td>", "Installer"));
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("dlsrc"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Latest</td>", "Src"));
				else
					System.out.println("Wrong usage.");
			}
			else if(TabCommands.text[CommandPositions.forge][0].getText().equalsIgnoreCase("rec") || TabCommands.text[6][0].getText().equalsIgnoreCase("recommended"))
			{
				if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("version"))
				{
					String result = createResult("<td>Recommended</td>", "Version");

					if(result.equalsIgnoreCase(createResult("<td>Latest</td>", "Version")))
						Utilities.sendMessage(TabCommands.receiver, result + " This is also the latest build.");
					else
						Utilities.sendMessage(TabCommands.receiver, result);
				}
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("changelog"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Recommended</td>", "Changelog"));
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("dlmain"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Recommended</td>", "Installer"));
				else if(TabCommands.text[CommandPositions.forge][1].getText().equalsIgnoreCase("dlsrc"))
					Utilities.sendMessage(TabCommands.receiver, createResult("<td>Recommended</td>", "Src"));
				else
					System.out.println("Wrong usage.");
			}
			else
				System.out.println("Wrong usage.");
	}

	private String createResult(String type, String action) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://files.minecraftforge.net/").openStream()));
		String line;

		if(action.equalsIgnoreCase("Version"))
		{
			while((line = reader.readLine()) != null)
			{
				if(line.contains(type))
				{
					line = reader.readLine();

					String mcVersion = (reader.readLine()).split(">")[1].split("<")[0];

					return line.split(">")[1].split("<")[0] + " (For Minecraft version " + mcVersion + ")";
				}
			}
		}
		else if(action.equalsIgnoreCase("Changelog"))
		{
			while((line = reader.readLine()) != null)
			{
				if(line.contains(type))
				{
					while((line = reader.readLine()) != null)
					{
						if(line.contains(action))
							return line.split("\"")[1];
					}
				}
			}
		}
		else
		{
			while((line = reader.readLine()) != null)
			{
				if(line.contains(type))
				{
					while((line = reader.readLine()) != null)
					{
						if(line.contains(action))
						{
							line = reader.readLine();
							return line.split("\"")[1];
						}
					}
				}
			}
		}
		return TabCommands.text[CommandPositions.forge][0].getText().equalsIgnoreCase("rec") ? "Couldn't create a result. Is there a recommended version already?" : "Couldn't create a result.";
	}

	@Override
	public String getAlias()
	{
		return "forge";
	}

	@Override
	public String getTooltip()
	{
		return "Gives you links to the latest Forge builds and their changelog.";
	}
}
