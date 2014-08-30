package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;

public class NameGuiButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(NameGui.firstRun)
			System.exit(0);
		else
			Core.nameGui.dispose();
	}
}