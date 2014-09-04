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
		 new JButton(), //change name
		 new JButton(), //reboot
		 new JButton(), //disabling/enabling the bot
		};

	public TabControl()
	{
		setLayout(null);

		controlButton[0].setText("Change Name");
		controlButton[0].setBounds(190, 40, 120, 40); //change name
		controlButton[0].addActionListener(new ControlButtonListener());
		controlButton[1].setText("Restart program");
		controlButton[1].setBounds(320, 40, 140, 40); //reboot
		controlButton[1].addActionListener(new ControlButtonListener());
		controlButton[2].setText("Disable bot");
		controlButton[2].setBounds(470, 40, 120, 40); //disabling/enabling the bot
		controlButton[2].addActionListener(new ControlButtonListener());

		util.addComponentArray(controlButton, this);
	}
}
