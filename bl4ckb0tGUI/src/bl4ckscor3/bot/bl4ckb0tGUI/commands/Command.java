package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.io.IOException;

public interface Command
{
	public void exe() throws IOException;
	
	public String getAlias();
}
