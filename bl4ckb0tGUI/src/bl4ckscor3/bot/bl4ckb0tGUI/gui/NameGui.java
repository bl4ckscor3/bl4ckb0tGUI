package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class NameGui extends JFrame
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
					if(Core.name != null)
						Core.name = text.getText();
					else
						Core.name = "Anonymous";
					
					Core.nameGui.dispose();
					Core.setupGui();
					Core.createBot();
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
