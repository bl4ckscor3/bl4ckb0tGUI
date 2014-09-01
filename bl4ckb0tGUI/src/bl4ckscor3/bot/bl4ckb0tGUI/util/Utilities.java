package bl4ckscor3.bot.bl4ckb0tGUI.util;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.CommandButtonListener;

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
				t.setBounds(x, y, 110, 20);
				x += 130;
			}

			y += 20;
		}

		//Special textfields
		text[text.length - 1][0].setBounds(310, 705, 150, 20);
	}

	public void setButtonBounds(JButton[] button)
	{
		int posY = 20;

		for(JButton b : button)
		{			
			b.setBounds(600, posY, 150, 20);
			posY += 20;
			b.addActionListener(new CommandButtonListener());
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
}
