package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JPanel;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.ControlButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class TabControl extends JPanel
{
	public static boolean firstRun = true;
	private Utilities util = new Utilities();
	public static JButton[] controlButton =
		{
		 new JButton(), //change name
		 new JButton(), //reboot
		 new JButton(), //disabling/enabling the bot
		 new JButton(), //list channels
		};

	public TabControl()
	{
		setLayout(null);

		controlButton[0].setText("Change Name");
		controlButton[0].setBounds(120, 40, 120, 40); //change name
		controlButton[1].setText("Restart program");
		controlButton[1].setBounds(260, 40, 140, 40); //reboot
		controlButton[2].setText("Disable bot");
		controlButton[2].setBounds(420, 40, 120, 40); //disabling/enabling the bot
		controlButton[3].setText("List Channels");
		controlButton[3].setBounds(560, 40, 120, 40); //list channels

		for(JButton b : controlButton)
		{
			if(TabControl.firstRun)
				b.addActionListener(new ControlButtonListener());
		}
		
		util.addComponentArray(controlButton, this);
	}
}
