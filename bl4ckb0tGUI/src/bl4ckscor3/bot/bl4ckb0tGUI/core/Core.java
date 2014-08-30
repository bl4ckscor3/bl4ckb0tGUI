package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.Gui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;

public class Core
{
	public static PircBotX bot;
	public static Gui gui;
	public static String name = "Anonymous";
	public static NameGui nameGui;
	public static boolean dev = true;

	public static void main(String args[]) throws IOException, IrcException
	{
		setupNameGui();
	}
	
	private static void setupNameGui()
	{
		nameGui = new NameGui();

		nameGui.setTitle("Username selection");
		nameGui.setFont(new Font("Arial", 0, 14));
		nameGui.setSize(300, 150);
		nameGui.setLocationRelativeTo(null);
		nameGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nameGui.setResizable(false);
		nameGui.setVisible(true);
	}

	public static void setupGui()
	{
		gui = new Gui();

		gui.setTitle("bl4ckb0t");
		gui.setFont(new Font("Arial", 0, 14));
		gui.setSize(800, 800);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setResizable(false);
		gui.setVisible(true);
	}

	public static void createBot()
	{
		Configuration config = new Configuration.Builder()	
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
