package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.pircbotx.exception.IrcException;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.NameGuiButtonListener;

public class NameGui extends JFrame
{
	public static boolean firstRun = true;
	private JLabel label = new JLabel();
	private JTextField text = new JTextField();
	private JButton buttonStart;
	private JButton buttonStop = new JButton();
	private String textText = "Please insert your username below.";
	private Container cp = getContentPane();
	Action accept = new AbstractAction("Accept")
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
			Runnable r = new Runnable()
			{
				@Override
				public void run() 
				{
					firstRun = false;
					Core.createBot();
				}
			};
			
			if(!text.getText().equals(""))
				Core.name = text.getText();

			Core.nameGui.dispose();
			
			if(firstRun)
			{
				Core.setupGui();
				worker.schedule(r, 10, TimeUnit.MILLISECONDS);
			}
		}
	};

	public NameGui()
	{
		buttonStart = new JButton(accept);
		cp.setLayout(null);
		label.setBounds(40, 10, textText.length() * 6, 20);
		label.setText(textText);
		text.setBounds(42, 40, 200, 20);
		
		if(firstRun)
			buttonStart.setText("Let's start!");
		else
		{
			text.setText(Core.name);
			buttonStart.setText("Change it!");
		}
		
		buttonStart.setBounds(10, 80, 100, 20);
		getRootPane().setDefaultButton(buttonStart);
		buttonStop.setText("I changed my mind.");
		buttonStop.setBounds(130, 80, 145 , 20);
		buttonStop.addActionListener(new NameGuiButtonListener());
		cp.add(label);
		cp.add(text);
		cp.add(buttonStart);
		cp.add(buttonStop);
	}
}
