package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.chat.ChatWindow;

public class SendButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String message = ChatWindow.getMessage();
		String channel = ChatWindow.getChannel();
	}
}
