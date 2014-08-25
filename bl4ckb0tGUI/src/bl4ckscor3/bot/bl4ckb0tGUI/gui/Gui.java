package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.core.ButtonListener;

public class Gui extends JFrame
{
	private Container cp = getContentPane();
	private ButtonListener listener = new ButtonListener();
	public String receiver;
	private JLabel[] label = 
		{
			new JLabel(), //-bukkit
			new JLabel(), //-changenick
			new JLabel()  //chan/user to send to
		};
	public JTextField[][] text = 
		{
			new JTextField[]{new JTextField()}, //-bukkit
			new JTextField[]{new JTextField()}, //-changenick
			new JTextField[]{new JTextField()}  //chan/user to send to
		};
	private JButton[] button = 
		{
			new JButton(), //-bukkit
			new JButton()  //-changenick
		};
	
	public Gui()
	{
		cp.setLayout(null);
		
		label[0].setText("-bukkit");
		text[0][0].setBounds(130, 20, 110, 20);
		button[0].setText("Issue '-bukkit'");
		
		label[1].setText("-changenick");
		text[1][0].setBounds(130, 40, 110, 20);
		button[1].setText("Issue '-changenick'");
		
		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");
		text[text.length - 1][0].setBounds(310, 730, 150, 20);
		
		setLabelBounds();
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
