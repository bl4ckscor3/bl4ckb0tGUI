package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;

public class ControlButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{	
		if(event.getActionCommand().equals(TabControl.controlButton[3].getText())) //change name
			Core.setupNameGui();
		else if(event.getActionCommand().equals(TabControl.controlButton[2].getText())) //reboot
		{
			ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();
			Runnable r = new Runnable()
			{
				@Override
				public void run() 
				{
					Core.createBot();
				}
			};

			Core.gui.dispose();
			Core.bot.sendIRC().quitServer("Rebooting...");
			Core.setupGui();
			worker.schedule(r, 10, TimeUnit.MILLISECONDS);
		}
		else if(event.getActionCommand().equals(TabControl.controlButton[1].getText())) //enable
		{
			if(!CommandButtonListener.enabled)
				CommandButtonListener.enabled = true;
			else
				new WarningGui("Already enabled!", "I am already enabled >:D");
		}
		else if(event.getActionCommand().equals(TabControl.controlButton[0].getText())) //disable
		{
			if(CommandButtonListener.enabled)
				CommandButtonListener.enabled = false;
			else
				new WarningGui("Already disabled!", "I am already disabled :(");
		}
	}
}