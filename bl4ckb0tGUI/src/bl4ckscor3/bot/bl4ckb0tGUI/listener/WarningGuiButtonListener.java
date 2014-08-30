package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WarningGuiButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		CommandButtonListener.warningGui.dispose();
	}
}