package bl4ckscor3.bot.bl4ckb0tGUI.commands;

public interface Command<Event>
{
	public void exe(Event event);
	
	public String getAlias();
}
