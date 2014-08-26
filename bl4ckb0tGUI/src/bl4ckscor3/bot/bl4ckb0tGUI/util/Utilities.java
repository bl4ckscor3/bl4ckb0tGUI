package bl4ckscor3.bot.bl4ckb0tGUI.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class Utilities
{
	public static String[] addAutoJoinChans() throws MalformedURLException, IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.dropbox.com/s/tishdl84z1wmcgs/bl4ckb0t%20chans.txt?dl=1").openStream()));
	
		if(Core.bot.getNick().equals("bl4ckb0t"))
			return reader.readLine().split(",");
		else
			return new String[]{"#bl4ckb0tTest"};
	}
	
	public static void sendMessage(String target, String message)
	{
		Core.bot.sendIRC().message(target, message);
	}
}
