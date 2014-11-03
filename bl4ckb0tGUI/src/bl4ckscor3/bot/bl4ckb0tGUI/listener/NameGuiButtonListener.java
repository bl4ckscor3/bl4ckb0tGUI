package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;

public class NameGuiButtonListener implements ActionListener
{
	private NameGui nameGui;

	//setting the instance of the gui
	public NameGuiButtonListener(NameGui gui)
	{
		nameGui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand().equals(nameGui.buttonStart.getText()))
		{
			ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
			Runnable r = new Runnable()
			{
				@Override
				public void run() 
				{
					TabControl.firstRun = false;
					Core.createBot();
				}
			};

			//checking for null
			if(!nameGui.text.getText().equals(""))
				Core.name = nameGui.text.getText();

			//closing the gui
			nameGui.dispose();

			//setting up the main gui
			if(TabControl.firstRun)
			{
				Core.setupGui();
				worker.schedule(r, 10, TimeUnit.MILLISECONDS);
			}
		}
		else if(event.getActionCommand().equals(nameGui.buttonStop.getText()))
		{
			//closing the program/window
			if(TabControl.firstRun)
				System.exit(0);
			else
				Core.nameGui.dispose();
		}
	}
}
