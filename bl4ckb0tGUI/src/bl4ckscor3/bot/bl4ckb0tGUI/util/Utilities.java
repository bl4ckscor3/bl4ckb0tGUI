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

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Draw;
import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.CommandButtonListener;

import com.google.common.collect.ImmutableSortedSet;

public class Utilities
{
	private static String[] validUsers =
		{
		"bl4ckscor3",
		"akino_germany"
		};

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

	public static String getButtonText(int labelArrayPosition, JLabel[] label)
	{
		return "Issue '" + label[labelArrayPosition].getText() + "'";
	}

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

	public void setTextBounds(JTextField[][] text)
	{
		int x;
		int y = 20;

		for(JTextField[] txt : text)
		{
			x = 130;

			for(JTextField t : txt)
			{
				if(x == 130 && y == 40) //needed so that the jtextfield at this position doesn't override the dropdown menu
					x = 260;
				
				t.setBounds(x, y, 110, 20);
				x += 130;
			}

			y += 20;
		}

		//Special textfields
		text[text.length - 1][0].setBounds(310, 705, 150, 20);
	}

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
	}
	
	public void addComponentArray(Component[] component, JPanel panel)
	{
		for(Component c : component)
			panel.add(c);
	}

	public void addNestedComponentArray(Component[][] component, JPanel panel)
	{
		for(Component[] comp : component)
		{
			for(Component c : comp)
				panel.add(c);
		}
	}

	public static boolean hasJoinedChannel(String chan)
	{
		String[] chans = getJoinedChannels();

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

	public static String[] getJoinedChannels()
	{
		ImmutableSortedSet<Channel> list = Core.bot.getUserBot().getChannels();
		Object[] x = list.toArray();
		String[] chans = new String[x.length];
		int i = 0;

		for(Object o : x)
		{
			chans[i] = o.toString().split(",")[0].split("=")[1];
			i++;
		}

		return chans;
	}

	public static void sorry()
	{
		sendMessage(TabCommands.receiver, "Sorry, only certain people are allowed to control me.");
	}

	public static boolean validUser()
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

	public static String[] getValidUsers()
	{
		return validUsers;
	}
}
