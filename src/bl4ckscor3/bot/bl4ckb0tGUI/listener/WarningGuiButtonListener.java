package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;

public class WarningGuiButtonListener implements ActionListener
{
	private WarningGui warningGui;

	//setting the instance of the gui
	public WarningGuiButtonListener(WarningGui gui)
	{
		warningGui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		//closing the gui
		warningGui.dispose();
	}
}