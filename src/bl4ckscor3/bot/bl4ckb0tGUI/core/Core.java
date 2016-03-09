package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.MainGui;
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
		EventQueue.invokeLater(new Runnable (){
			@Override
			public void run()
			{
				try
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					nameGui = new NameGui();
					nameGui.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
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
		Configuration config = new Configuration.Builder()	
		.setName("bl4ckb0t1")
		.setVersion("1.0")
		.addServer("irc.esper.net", 6667)
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
