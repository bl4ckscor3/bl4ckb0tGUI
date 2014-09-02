package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.NameGui;

public class NameGuiButtonListener implements ActionListener
{
	private NameGui nameGui;

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
					nameGui.firstRun = false;
					Core.createBot();
				}
			};

			if(!nameGui.text.getText().equals(""))
				Core.name = nameGui.text.getText();

			Core.nameGui.dispose();

			if(nameGui.firstRun)
			{
				Core.setupGui();
				worker.schedule(r, 10, TimeUnit.MILLISECONDS);
			}
		}
		else if(event.getActionCommand().equals(nameGui.buttonStop.getText()))
		{
			if(NameGui.firstRun)
				System.exit(0);
			else
				Core.nameGui.dispose();
		}
	}
}
