package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JPanel;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.ControlButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class TabControl extends JPanel
{
	private static final long serialVersionUID = 2819044912756549478L;
	public static boolean firstRun = true;
	private Utilities util = new Utilities();
	public static JButton[] controlButton = {
			new JButton(), //change name
			new JButton(), //reboot
			new JButton(), //disabling/enabling the bot
			new JButton(), //list channels
			new JButton(), //source
			new JButton()  //chat window
	};

	public TabControl()
	{
		setLayout(null);

		controlButton[0].setText("Change Name");
		controlButton[0].setBounds(60, 40, 120, 40); //change name
		controlButton[1].setText("Restart program");
		controlButton[1].setBounds(200, 40, 140, 40); //reboot
		controlButton[2].setText("Disable bot");
		controlButton[2].setBounds(360, 40, 120, 40); //disabling/enabling the bot
		controlButton[3].setText("List Channels");
		controlButton[3].setBounds(500, 40, 120, 40); //list channels
		controlButton[4].setText("Source");
		controlButton[4].setBounds(640, 40, 110, 40); //source
		controlButton[5].setText("Chatting");
		controlButton[5].setBounds(60, 100, 120, 40); //chat window

		//adding the buttons to the gui
		if(TabControl.firstRun)
		{	
			for(JButton b : controlButton)
			{
				b.addActionListener(new ControlButtonListener());
			}
		}

		//adding the buttons to the gui
		util.addComponentArray(controlButton, this);
	}
}
