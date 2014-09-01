package bl4ckscor3.bot.bl4ckb0tGUI.gui.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabOutput;

public class MainGui extends JFrame
{
	private JTabbedPane tabs = new JTabbedPane();
	public JPanel control = new TabControl();
	public JPanel cmds = new TabCommands();
	public JPanel output = new TabOutput();
	
	public MainGui()
	{
		tabs.addTab("Control", control);
		tabs.addTab("Commands", cmds);
		tabs.addTab("Output", output);
		add(tabs);
	}
}
