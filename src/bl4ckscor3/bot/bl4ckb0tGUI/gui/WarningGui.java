package bl4ckscor3.bot.bl4ckb0tGUI.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.listener.WarningGuiButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class WarningGui extends JFrame
{
	private Action accept = new AbstractAction("Accept")
	{
		@Override
		public void actionPerformed(ActionEvent event){} //this get's handled by the listener (i don't really know why it needs this, but w/e)
	};

	public WarningGui(String title, String text)
	{
		Container cp = getContentPane();
		JLabel label = new JLabel();
		JButton button = new JButton(accept);
		Action action = new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				//closing the window
				dispose();
			}
		};

		//when pressing the escape button the window closes
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false), "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", action);
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
		getRootPane().setDefaultButton(button); //when pressing enter this button gets activated

		//adding the button to the gui
		add(label);
		add(button);
	}
}
