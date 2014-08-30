package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.WarningGuiButtonListener;

public class WarningGui extends JFrame
{
	public WarningGui()
	{
		Container cp = getContentPane();
		JLabel label = new JLabel();
		JButton button = new JButton();
		
		cp.setLayout(null);

		label.setText("You need to specify a target!");
		label.setBounds(65, 20, 200, 20);
		button.setText("OK!");
		button.setBounds(95, 60, 100, 20);
		button.addActionListener(new WarningGuiButtonListener());
		
		add(label);
		add(button);
	}
}
