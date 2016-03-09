package bl4ckscor3.bot.bl4ckb0tGUI.util;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.pircbotx.Channel;

import com.google.common.collect.ImmutableSortedSet;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Draw;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Scramble;
import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.CommandButtonListener;

public class Utilities
{
	private static String[] validUsers = {
			"bl4ckscor3",
			"akino_germany",
			"Vauff"
	};

	public static String[] addAutoJoinChans() throws MalformedURLException, IOException
	{
		//getting the .txt document with the default channels
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.dropbox.com/s/tishdl84z1wmcgs/bl4ckb0t%20chans.txt?dl=1").openStream()));

		if(Core.bot.getNick().equals("bl4ckb0t"))
			return reader.readLine().split(",");
		else
			return new String[]{"#bl4ckb0tTest"};
	}

	/**
	 * Sending a message to the target
	 * @param target - Where the message will be sent to
	 * @param message - The text to be sent
	 */
	public static void sendMessage(String target, String message)
	{
		Core.bot.sendIRC().message(target, message);
	}

	/**
	 * Generates the text to display on the button
	 * @param labelArrayPosition - Which position in the array of labels the corresponding label is at
	 * @param label - The label array
	 */
	public static String getButtonText(int labelArrayPosition, JLabel[] label)
	{
		return "Issue '" + label[labelArrayPosition].getText() + "'";
	}

	/**
	 * Setting the position and size of the JLabels
	 * @param label - The label array
	 */
	public void setLabelBounds(JLabel[] label)
	{
		int posY = 20;

		for(JLabel l : label)
		{
			l.setBounds(30, posY, 110, 20);
			posY += 20;
		}

		//Special Labels
		label[label.length - 1].setBounds(55, 675, 800, 20);
	}

	/**
	 * Setting the position and size of the JTextFields
	 * @param text - The text array
	 */
	public void setTextBounds(JTextField[][] text)
	{
		int x;
		int y = 20;
		int i = 0;

		for(JTextField[] txt : text)
		{
			x = 130;

			for(JTextField t : txt)
			{
				if(i == CommandPositions.calc) //needed so that the jtextfield at this position doesn't override the dropdown menu
					x += 130;

				t.setBounds(x, y, 110, 20);
				x += 130;
			}

			y += 20;
			i++;
		}

		//Special textfields
		text[text.length - 1][0].setBounds(310, 705, 150, 20);
	}

	/**
	 * Setting the position and size of the JButtons and adding their listeners
	 * 
	 * @param button - The button array
	 * @param label - The label array
	 */
	public void setButtonProperties(JButton[] button, JLabel[] label)
	{
		int posY = 20;
		int i = 0;

		for(JButton b : button)
		{			
			b.setBounds(600, posY, 150, 20);
			posY += 20;
			b.setText(getButtonText(i, label));

			if(TabControl.firstRun)
				b.addActionListener(new CommandButtonListener());

			i++;
		}
	}		

	/**
	 * Adding the options to the drop down menus
	 * @param dropDown - The array of different dropdown menus
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void addDropDownTexts(JComboBox[] dropDown)
	{
		for(String s : Calculate.operations)
		{
			dropDown[0].addItem(s);
		}

		for(String s : Draw.drawings)
		{
			dropDown[1].addItem(s);
		}

		for(int i : Scramble.scrambleAmounts)
		{
			dropDown[2].addItem(i);
		}
	}

	/**
	 * Adding the components (JLabel, JButton etc.) to the GUI
	 * @param component - The array to add
	 * @param panel - The panel to add to
	 */
	public void addComponentArray(Component[] component, JPanel panel)
	{
		for(Component c : component)
			panel.add(c);
	}

	/**
	 * Adding the components (JLabel, JButton etc.) to the GUI
	 * @param component - The array to add (double array)
	 * @param panel - The panel to add to
	 */
	public void addNestedComponentArray(Component[][] component, JPanel panel)
	{
		for(Component[] comp : component)
		{
			for(Component c : comp)
				panel.add(c);
		}
	}

	/**
	 * Checking if the bot is in that channel
	 * @param chan - Channel to check if the bot is in
	 * @return - true if the bot is in the channel, false if not
	 */
	public static boolean hasJoinedChannel(String chan)
	{
		String[] chans = getJoinedChannelsSecret();

		for(String s : chans)
		{
			if(s != null)
			{
				if(s.equalsIgnoreCase(chan))
					return true;
			}
		}
		return false;
	}

	/**
	 * Getting all the channels the bot is in (without secret channels)
	 */
	public static String[] getJoinedChannels()
	{
		ImmutableSortedSet<Channel> list = Core.bot.getUserBot().getChannels(); //getting the channels from pircbotx
		Object[] x = list.toArray(); //converting the list to an array
		String[] chans = new String[x.length]; //creating a string array of the length of the object array to be able to save the channel names
		int i = 0; //counter

		for(Object o : x)
		{
			if(!o.toString().contains("secret=true"))
				chans[i] = o.toString().split(",")[0].split("=")[1]; //filtering the channels

			i++;
		}

		return chans;
	}

	/**
	 * Getting all the channels the bot is in (with secret channels)
	 */
	public static String[] getJoinedChannelsSecret()
	{
		ImmutableSortedSet<Channel> list = Core.bot.getUserBot().getChannels(); //getting the channels from pircbotx
		Object[] x = list.toArray(); //converting the list to an array
		String[] chans = new String[x.length]; //creating a string array of the length of the object array to be able to save the channel names
		int i = 0; //counter

		for(Object o : x)
		{
			chans[i] = o.toString().split(",")[0].split("=")[1]; //filtering the channels
			i++;
		}

		return chans;
	}

	/**
	 * Checking if the user is a user with admin rights
	 */
	public static boolean isValidUser()
	{	
		for(String s : validUsers)
		{
			if(Core.name.equalsIgnoreCase(s))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Getting all users with admin rights
	 */
	public static String[] getValidUsers()
	{
		return validUsers;
	}
}
