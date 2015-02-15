package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.NameGuiButtonListener;

public class NameGui extends JFrame
{
	private JLabel label = new JLabel();
	public JTextField text = new JTextField();
	public JButton buttonStart;
	public JButton buttonStop = new JButton();
	private String textText = "Please insert your username below.";
	private Container cp = getContentPane();
	private Action accept = new AbstractAction("Accept")
	{
		@Override
		public void actionPerformed(ActionEvent event){} //this get's handled by the listener (i don't really know why it needs this, but w/e)
	};

	public NameGui()
	{
		Action action = new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				if(TabControl.firstRun)
					System.exit(0);
				else
					dispose();
			}
		};
		
		//when pressing the escape button the window closes
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false), "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", action);
		
		buttonStart = new JButton(accept);
		cp.setLayout(null);
		label.setBounds(40, 10, textText.length() * 6, 20);
		label.setText(textText);
		text.setBounds(42, 40, 200, 20);
		
		//when the program gets started, print out "Let's start!" and if there's an on-run name change, print out "Change it!"
		if(TabControl.firstRun)
			buttonStart.setText("Let's start!");
		else
		{
			text.setText(Core.name);
			buttonStart.setText("Change it!");
		}
		
		buttonStart.setBounds(10, 80, 100, 20);
		buttonStart.addActionListener(new NameGuiButtonListener(this));
		getRootPane().setDefaultButton(buttonStart); //when pressing enter this button gets activated
		buttonStop.setText("I changed my mind.");
		buttonStop.setBounds(130, 80, 145 , 20);
		buttonStop.addActionListener(new NameGuiButtonListener(this));
		//adding the components to the gui
		cp.add(label);
		cp.add(text);
		cp.add(buttonStart);
		cp.add(buttonStop);
	}
}
