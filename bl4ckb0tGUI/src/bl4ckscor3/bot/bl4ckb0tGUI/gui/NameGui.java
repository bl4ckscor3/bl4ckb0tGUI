package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class NameGui extends JFrame
{
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
					Core.createBot();
				}
			};
			
			if(text.getText() != null)
				Core.name = text.getText();
			else
				Core.name = "Anonymous";

			Core.nameGui.dispose();
			System.out.println("start");
			Core.setupGui();
			worker.schedule(r, 1, TimeUnit.SECONDS);
		}
	};
	private JLabel label = new JLabel();
	private JTextField text = new JTextField();
	private JButton buttonStart = new JButton(accept);
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
		getRootPane().setDefaultButton(buttonStart);
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
			System.exit(0);
		}
	}
}
