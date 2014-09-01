package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.document.JTextFieldLimited;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.CommandButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.ControlButtonListener;

public class MainGui extends JFrame
{
	private Container cp = getContentPane();
	public String receiver;
	private JLabel[] label = 
		{
			new JLabel(), //-bukkit
			new JLabel(), //-calc
			new JLabel(), //-cbukkit
			new JLabel(), //-changenick
			new JLabel(), //-decide
			new JLabel()  //chan/user to send to
		};
	public JTextField[][] text = 
		{
			new JTextField[]{new JTextField()}, //-bukkit
			new JTextField[]{new JTextField(), new JTextField()}, //-calc
			new JTextField[]{new JTextField()}, //-cbukkit
			new JTextField[]{new JTextField()}, //-changenick
			new JTextField[]{new JTextField()}, //-decide
			new JTextField[]{new JTextField()}  //chan/user to send to
		};
	public JButton[] button = 
		{
			new JButton(), //-bukkit
			new JButton(), //-calc
			new JButton(), //-cbukkit
			new JButton(), //-decide
			new JButton(), //-changenick
		};
	public JButton[] controlButton =
		{
			new JButton(), //disabling the bot
			new JButton(), //enabling the bot
			new JButton(), //reboot
			new JButton(), //change name
		};

	public MainGui()
	{
		cp.setLayout(null);

		label[0].setText("-bukkit");
		button[0].setText(getButtonText(0));

		label[1].setText("-calc");
		text[1][0].setDocument(new JTextFieldLimited(1, "+", "-", "*", "/", "^", "%", "!"));
		button[1].setText(getButtonText(1));

		label[2].setText("-cbukkit");
		button[2].setText(getButtonText(2));

		label[3].setText("-changenick");
		button[3].setText(getButtonText(3));

		label[4].setText("-decide");
		button[4].setText(getButtonText(4));

		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");

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

		setLabelBounds();
		setTextBounds();
		setButtonBounds();
		addComponentArray(label);
		addNestedComponentArray(text);
		addComponentArray(button);
		addComponentArray(controlButton);
	}

	private String getButtonText(int labelArrayPosition)
	{
		return "Issue '" + label[labelArrayPosition].getText() + "'";
	}

	private void setLabelBounds()
	{
		int posY = 120;

		for(JLabel l : label)
		{
			l.setBounds(30, posY, 110, 20);
			posY += 20;
		}

		//Special Labels
		label[label.length - 1].setBounds(55, 700, 800, 20);
	}

	private void setTextBounds()
	{
		int x;
		int y = 120;

		for(JTextField[] txt : text)
		{
			x = 130;

			for(JTextField t : txt)
			{
				t.setBounds(x, y, 110, 20);
				x += 130;
			}

			y += 20;
		}

		//Special textfields
		text[text.length - 1][0].setBounds(310, 730, 150, 20);
	}

	private void setButtonBounds()
	{
		int posY = 120;

		for(JButton b : button)
		{			
			b.setBounds(600, posY, 150, 20);
			posY += 20;
			b.addActionListener(new CommandButtonListener());
		}
	}		

	private void addComponentArray(Component[] component) 
	{
		for(Component c : component)
			cp.add(c);
	}

	private void addNestedComponentArray(Component[][] component) 
	{
		for(Component[] comp : component)
		{
			for(Component c : comp)
				cp.add(c);
		}
	}
}
