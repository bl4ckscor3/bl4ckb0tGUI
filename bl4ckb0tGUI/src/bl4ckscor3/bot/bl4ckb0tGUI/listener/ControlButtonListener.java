package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class ControlButtonListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand().equals(TabControl.controlButton[0].getText())) //change name
			Core.setupNameGui();
		else if(event.getActionCommand().equals(TabControl.controlButton[1].getText())) //reboot
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
		else if(event.getActionCommand().equals(TabControl.controlButton[2].getText())) //disabling/enabling the bot
		{
			if(CommandButtonListener.enabled)
			{
				CommandButtonListener.enabled = false;
				TabControl.controlButton[2].setText("Enable bot");
			}
			else
			{
				CommandButtonListener.enabled = true;
				TabControl.controlButton[2].setText("Disable bot");
			}
		}
		else if(event.getActionCommand().equals(TabControl.controlButton[3].getText())) //list channels
		{
			String[] chans = Utilities.getJoinedChannels();
			StringBuilder builder = new StringBuilder();

			TabCommands.receiver = Core.dev ? "#bl4ckb0tTest" : TabCommands.text[TabCommands.text.length - 1][0].getText();
			
			for(String s : chans)
			{
				if(s != null)
					builder.append(s + " | ");
			}

			builder.deleteCharAt(builder.length() - 1);
			builder.deleteCharAt(builder.length() - 1);
			Utilities.sendMessage(TabCommands.receiver, "I joined these channels: " + builder.toString());
		}
		else if(event.getActionCommand().equals(TabControl.controlButton[4].getText())) //source
		{
			try
			{
				Desktop.getDesktop().browse(URI.create("https://github.com/bl4ckscor3/bl4ckb0tGUI"));
			}
			catch(IOException e){}
		}
	}
}