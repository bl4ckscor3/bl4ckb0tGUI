package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.Gui;

public class Core
{
	public static PircBotX bot;
	public static Gui gui;
	public static String name;
	private static Core core = new Core();
	private static NameGui nGui;
	
	public static void main(String args[]) throws IOException, IrcException
	{
		setupNameGui();
		createBot();
	}
	
	private static void setupNameGui()
	{
		nGui = core.new NameGui();
		
		nGui.setTitle("Username selection");
		nGui.setFont(new Font("Arial", 0, 14));
		nGui.setSize(300, 150);
		nGui.setLocationRelativeTo(null);
		nGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nGui.setEnabled(true);
		nGui.setVisible(true);
	}
	
	private static void setupGui()
	{
		gui = new Gui();

		gui.setTitle("bl4ckb0t");
		gui.setFont(new Font("Arial", 0, 14));
		gui.setSize(800, 800);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setEnabled(true);
		gui.setVisible(true);
	}
	
	public static void createBot()
	{
		Configuration config = new Configuration.Builder()	
		.setName("bl4ckb0t")
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
	
	private class NameGui extends JFrame
	{
		private JLabel label = new JLabel();
		private JTextField text = new JTextField();
		private JButton buttonStart = new JButton();
		private JButton buttonStop = new JButton();
		private String textText = "Please insert your username below.";
		private Container cp = getContentPane();
		
		public NameGui()
		{
			cp.setLayout(null);
			label.setBounds(40, 10, textText.length() * 6, 20);
			label.setText(textText);
			text.setBounds(42, 40, 200, 20);
			buttonStart.setText("Let's start!");
			buttonStart.setBounds(10, 80, 100, 20);
			buttonStart.addActionListener(new ButtonListener());
			buttonStop.setText("I changed my mind.");
			buttonStop.setBounds(130, 80, 145 , 20);
			buttonStop.addActionListener(new ButtonListener());
			cp.add(label);
			cp.add(text);
			cp.add(buttonStart);
			cp.add(buttonStop);
		}
		
		private class ButtonListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				switch(event.getActionCommand())
				{
					case "Let's start!":
						if(name != null)
							name = text.getText();
						else
							name = "Anonymous";
						
						nGui.dispose();
						setupGui();
						break;
					case "I changed my mind.":
						System.exit(0);
						break;
					default:
						System.out.println("Something went wrong: " + event.getActionCommand());
				}
			}
		}
	}
}
