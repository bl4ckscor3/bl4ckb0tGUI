package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JPanel;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.ControlButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class TabControl extends JPanel
{
	private Utilities util = new Utilities();
	public static JButton[] controlButton =
		{
			new JButton(), //disabling the bot
			new JButton(), //enabling the bot
			new JButton(), //reboot
			new JButton(), //change name
		};
	
	public TabControl()
	{
		setLayout(null);
		
		controlButton[0].setText("Disable bot");
		controlButton[0].setBounds(560, 40, 120, 40); //disabling the bot
		controlButton[0].addActionListener(new ControlButtonListener());
		controlButton[1].setText("Enable bot");
		controlButton[1].setBounds(420, 40, 120, 40); //enabling the bot
		controlButton[1].addActionListener(new ControlButtonListener());
		controlButton[2].setText("Restart program");
		controlButton[2].setBounds(260, 40, 140, 40); //reboot
		controlButton[2].addActionListener(new ControlButtonListener());
		controlButton[3].setText("Change Name");
		controlButton[3].setBounds(120, 40, 120, 40); //change name
		controlButton[3].addActionListener(new ControlButtonListener());

		util.addComponentArray(controlButton, this);
	}
}
