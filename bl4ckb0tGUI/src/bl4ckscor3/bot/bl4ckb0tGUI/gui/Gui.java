package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.core.ButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.document.JTextFieldLimited;

public class Gui extends JFrame
{
	private Container cp = getContentPane();
	private ButtonListener listener = new ButtonListener();
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
	private JButton[] button = 
		{
			new JButton(), //-bukkit
			new JButton(), //-calc
			new JButton(), //-cbukkit
			new JButton(), //-decide
			new JButton()  //-changenick
		};
	
	public Gui()
	{
		cp.setLayout(null);
		
		label[0].setText("-bukkit");
		button[0].setText("Issue '-bukkit'");
		
		label[1].setText("-calc");
		text[1][0].setDocument(new JTextFieldLimited(1, "+", "-", "*", "/", "^", "%", "!"));
		button[1].setText("Issue '-calc'");
		
		label[2].setText("-cbukkit");
		button[2].setText("Issue '-cbukkit'");
		
		label[3].setText("-changenick");
		button[3].setText("Issue '-changenick'");
		
		label[4].setText("-decide");
		button[4].setText("Issue '-decide'");
		
		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");
		
		setLabelBounds();
		setTextBounds();
		setButtonBounds();
		addComponentArray(label);
		addNestedComponentArray(text);
		addComponentArray(button);
	}
	
	private void setLabelBounds()
	{
		int posY = 20;
		
		for(JLabel l : label)
		{
			l.setBounds(30, posY, 110, 20);
			posY = posY + 20;
		}
		
		//Special Labels
		label[label.length - 1].setBounds(55, 700, 800, 20);
	}
	
	private void setTextBounds()
	{
		int x;
		int y = 20;
		
		for(JTextField[] txt : text)
		{
			x = 130;

			for(JTextField t : txt)
			{
				t.setBounds(x, y, 110, 20);
				x = x + 130;
			}
			
			y = y + 20;
		}
		
		//Special text
		text[text.length - 1][0].setBounds(310, 730, 150, 20);
	}
	
	private void setButtonBounds()
	{
		int posY = 20;
		
		for(JButton b : button)
		{			
			b.setBounds(600, posY, 150, 20);
			posY = posY + 20;
			b.addActionListener(listener);
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
