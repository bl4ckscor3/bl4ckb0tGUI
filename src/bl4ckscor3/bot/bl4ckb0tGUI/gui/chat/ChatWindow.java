package bl4ckscor3.bot.bl4ckb0tGUI.gui.chat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.SendButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class ChatWindow extends JFrame
{
	public static JTabbedPane tabs = new JTabbedPane();
	private static JTextField input = new JTextField();
	private static JButton send = new JButton();
	public static List<String> openChannelTabs = new ArrayList<String>();
	
	public ChatWindow()
	{
		Action action = new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				dispose();
			}
		};

		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false), "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", action);
		setTitle("Chatting");
		setFont(new Font("Arial", 0, 14));
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		setupContents();
	}

	private void setupContents()
	{
		input.setBounds(25, 625, 540, 20);
		send.setBounds(585, 625, 80, 20);
		send.setText("Send");

		if(ChatTab.firstRun)
			send.addActionListener(new SendButtonListener());

		for(String name : Utilities.getJoinedChannelsSecret())
		{
			boolean found = false;
			
			for(String tab : openChannelTabs)
			{
				if(name.equals(tab))
				{
					found = true;
					break;
				}
			}
			
			if(found)
				continue;
			else
			{
				tabs.addTab(name, new ChatTab());
				openChannelTabs.add(name);
			}
		}
		
		add(input);
		add(send);
		add(tabs);
	}

	/**
	 * Returns the text written into the JTextField. This is the message which will get sent to the channel
	 */
	public static String getMessage()
	{
		return input.getText();
	}

	/**
	 * Returns the selected tab to determine which channel the message goes to
	 */
	public static String getChannel()
	{
		return tabs.getTitleAt(tabs.getSelectedIndex());
	}
}
