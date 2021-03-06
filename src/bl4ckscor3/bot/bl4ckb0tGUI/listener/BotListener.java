package bl4ckscor3.bot.bl4ckb0tGUI.listener;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.ConnectEvent;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class BotListener extends ListenerAdapter
{
	@Override
	public void onConnect(ConnectEvent event) throws Exception //figuring out which channels to join
	{
		String[] channelsToJoin = Utilities.addAutoJoinChans();
		
		for(String s : channelsToJoin)
		{
			Core.bot.sendIRC().joinChannel(s);
		}
	}
}
