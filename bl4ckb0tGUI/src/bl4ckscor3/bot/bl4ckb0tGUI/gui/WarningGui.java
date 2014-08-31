package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.WarningGuiButtonListener;

public class WarningGui extends JFrame
{
	public WarningGui(String title, String text)
	{
		Container cp = getContentPane();
		JLabel label = new JLabel();
		JButton button = new JButton();
		
		cp.setLayout(null);
		setTitle(title);
		setFont(new Font("Arial", 0, 14));
		setSize(300, 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		label.setText(text);
		label.setBounds(65, 20, 200, 20);
		button.setText("OK!");
		button.setBounds(95, 60, 100, 20);
		button.addActionListener(new WarningGuiButtonListener(this));
		
		add(label);
		add(button);
	}
}
