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
	private JLabel[] label = 
		{
			new JLabel() //-changenick
		};
	public JTextField[] text = 
		{
			new JTextField() //-changenick
		};
	private JButton[] button = 
		{
			new JButton() //-changenick
		};
	
	public Gui()
	{
		cp.setLayout(null);
		
		label[0].setText("-changenick");
		label[0].setBounds(30, 20, 110, 20); //pos x, pos y, width, height
		text[0].setBounds(130, 20, 110, 20);
		button[0].setText("Issue '-changenick'");
		
		setButtonBounds();
		addComponentArray(label);
		addComponentArray(text);
		addComponentArray(button);
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
}
