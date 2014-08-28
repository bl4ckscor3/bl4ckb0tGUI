package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Bukkit;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Calculate;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.ChangeNick;
import bl4ckscor3.bot.bl4ckb0tGUI.commands.Command;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;


public class ButtonListener implements ActionListener
{
	private LinkedList<Command> commands = new LinkedList();
	private WarningGui gui;
	
	public ButtonListener()
	{
		commands.add(new Bukkit());
		commands.add(new Calculate());
		commands.add(new ChangeNick());
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		for(Command c : commands)
		{
			if(("Issue '-" + c.getAlias() + "'").equalsIgnoreCase(event.getActionCommand()))
			{
				Core.gui.receiver = Core.gui.text[Core.gui.text.length - 1][0].getText();
				
				try
				{
					if(!c.getAlias().equals("changenick"))
						Utilities.sendMessage(Core.gui.receiver, Core.name + " issued this command: -" + c.getAlias() + " ");
					
					c.exe();
				}
				catch(IOException e){}
				catch(IllegalArgumentException e)
				{
					gui = new WarningGui();
					
					gui.setTitle("WARNING");
					gui.setFont(new Font("Arial", 0, 14));
					gui.setSize(300, 150);
					gui.setLocationRelativeTo(null);
					gui.setEnabled(true);
					gui.setVisible(true);
				}

				return;
			}
		}
		System.out.println("Something went wrong.");
	}
	
	private class WarningGui extends JFrame
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
			button.addActionListener(new ButtonListener2());
			
			add(label);
			add(button);
		}
		
		private class ButtonListener2 implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				gui.dispose();
			}
		}
	}
}
