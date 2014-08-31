package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractAction;
import javax.swing.Action;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

public class MainGuiButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{	
		if(event.getActionCommand().equals(Core.gui.button[Core.gui.button.length - 1].getText()))
			Core.setupNameGui();
		else if(event.getActionCommand().equals(Core.gui.button[Core.gui.button.length - 2].getText()))
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
	}
}