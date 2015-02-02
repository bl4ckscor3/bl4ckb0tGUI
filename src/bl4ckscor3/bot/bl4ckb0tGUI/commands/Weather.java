package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Weather implements ICommand
{
	private boolean error = false;

	@Override
	public void exe() throws IOException 
	{
		String[] data = new String[19];//1 = name | 3 = country | 6 = temperature | 7 = humidity | 8 = pressure | 10 = wind speed | 11 = wind direction | 13 = clouds
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://api.openweathermap.org/data/2.5/weather?q=" + TabCommands.text[CommandPositions.weather][0].getText() + "&mode=xml").openStream()));	

		if(reader.readLine().equalsIgnoreCase("{\"message\":\"Error: Not found city\",\"cod\":\"404\"}"))
			Utilities.sendMessage(TabCommands.receiver, "Sorry, I couldn't find a city named \"" + TabCommands.text[19][0].getText() + "\" :/");
		else
		{
			for(int i = 0; i < 19; i++)
			{
				data[i] = reader.readLine();
			}

			filter(data);

			if(!error)
				Utilities.sendMessage(TabCommands.receiver, "** " + data[1] + ", " + data[3] + " ** Conditions: " + data[13] + " ** Temperature: " + data[6] + " ** Humidity: " + data[7] + " ** Pressure: " + data[8] + " ** Wind: " + data[11] + ", with " + data[10] + " ** Powered by OpenWeatherMap - http://openweathermap.org/city/" + data[1] + "/ **");
			else
				Utilities.sendMessage(TabCommands.receiver, "** " + data[1] + ", " + data[3] + " ** Conditions: " + data[13] + " ** Temperature: " + data[6] + " ** Humidity: " + data[7] + " ** Pressure: " + data[8] + " ** Wind: " + data[11] + " ** Powered by OpenWeatherMap - http://openweathermap.org/city/" + data[1] + "/ **");
		}
	}

	private void filter(String[] data)
	{
		String[] temp = data;
		double kentucky;
		double fried;
		double chicken;

		data[1] = temp[1].split("\"")[3];
		data[3] = temp[3].split(">")[1].split("<")[0];
		kentucky = Double.parseDouble(temp[6].split("\"")[1]);
		fried = Math.round((9D / 5D * (kentucky - 273.15D) + 32D) * 100D) / 100D;
		chicken = Math.round((5D / 9D * (fried - 32D)) * 100D) / 100D;
		data[6] = chicken + "°C | " + fried + "°F | " + kentucky + "K";	
		data[7] = temp[7].split("\"")[1] + "%";
		data[8] = temp[8].split("\"")[1] + "hPa";

		try
		{
			data[10] = temp[10].split("\"")[1] + "m/s (" + temp[10].split("\"")[3] + ")";
			data[11] = temp[11].split("\"")[5];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			temp = data;
			data[10] = temp[10].split("\"")[1] + "m/s";
			error = true;
		}

		data[13] = temp[13].split("\"")[3];
	}

	@Override
	public String getAlias() 
	{
		return "w";
	}

	@Override
	public String getTooltip()
	{
		return "Notifies you of your local weather. Or anywhere in the world.";
	}
}
