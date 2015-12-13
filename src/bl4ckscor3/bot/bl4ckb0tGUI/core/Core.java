package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.MainGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.BotListener;

public class Core
{
	public static PircBotX bot;
	public static MainGui gui;
	public static String name = "Anonymous";
	public static NameGui nameGui;
	public static boolean dev = true;

	public static void main(String args[]) throws IOException, IrcException
	{
		setupNameGui();
	}
	
	/**
	 * Setting up the first GUI which gets displayed
	 */
	public static void setupNameGui()
	{
		nameGui = new NameGui();

		nameGui.setTitle("Username selection");
		nameGui.setFont(new Font("Arial", 0, 14));
		nameGui.setSize(300, 150);
		nameGui.setLocationRelativeTo(null); //middle of screen
		
		//to make sure that an on-run name change doesn't close the whole process
		if(TabControl.firstRun)
			nameGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		else
			nameGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		nameGui.setResizable(false);
		nameGui.setVisible(true);
	}

	/**
	 * Setting up the main gui with all the tabs, etc.
	 */
	public static void setupGui()
	{
		gui = new MainGui();

		gui.setTitle("bl4ckb0t");
		gui.setFont(new Font("Arial", 0, 14));
		gui.setSize(800, 800);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);
	}

	/**
	 * Setting up the bot and starting it
	 */
	public static void createBot()
	{
		Configuration<PircBotX> config = new Configuration.Builder<PircBotX>()	
		.setName("bl4ckb0t1")
		.setVersion("1.0")
		.setServerHostname("irc.esper.net")
		.setServerPort(6667)
		.setNickservPassword("xxx")
		.setLogin("bl4ckb0t")
		.setAutoNickChange(true)
		.addListener(new BotListener())
		.setMessageDelay(500)
		.buildConfiguration();
		
		bot = new PircBotX(config);

		try
		{
			bot.startBot();
		}
		catch(IOException e){}
		catch(IrcException e){}
	}
}
