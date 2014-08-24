package bl4ckscor3.bot.bl4ckb0tGUI.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		switch(event.getActionCommand())
		{
			case "Issue '-changenick'":
				Core.bot.sendIRC().changeNick(Core.gui.text[0].getText());
			default:
				System.out.println("Whoops, this button was pressed: |" + event.getActionCommand() + "|");
		}
	}
}
