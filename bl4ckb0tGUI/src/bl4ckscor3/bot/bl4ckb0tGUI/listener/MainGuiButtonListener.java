package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class MainGuiButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		Core.setupNameGui();
	}
}