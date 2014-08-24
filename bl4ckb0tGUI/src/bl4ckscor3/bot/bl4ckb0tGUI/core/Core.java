package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.Gui;

public class Core
{
	public static PircBotX bot;
	
	public static void main(String args[]) throws IOException, IrcException
	{
//		createBot();
		setupGui();
	}

	public static void createBot() throws IOException, IrcException
	{
		Configuration config = new Configuration.Builder()	
		.setName("bl4ckb0t")
		.setVersion("1.0")
		.setServerHostname("irc.esper.net")
		.setServerPort(6667)
		.setNickservPassword("xxx")
		.setLogin("bl4ckb0t")
		.setAutoNickChange(true)
		.addListener(new Listener())
		.setMessageDelay(500)
		.buildConfiguration();
		bot = new PircBotX(config);
		bot.startBot();
	}
	
	private static void setupGui()
	{
		Gui gui = new Gui();

		gui.setTitle("bl4ckb0t");
		gui.setFont(new Font("Arial", 0, 14));
		gui.setSize(800, 800);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setEnabled(true);
		gui.setVisible(true);
	}
}
