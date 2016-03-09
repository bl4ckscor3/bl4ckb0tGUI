package bl4ckscor3.bot.bl4ckb0tGUI.gui.main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.PrintStream;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabOutput;
import bl4ckscor3.bot.bl4ckb0tGUI.output.JTextAreaOutputStream;

public class MainGui extends JFrame
{
	private static final long serialVersionUID = 6538798925768695125L;
	private JTabbedPane tabs = new JTabbedPane();
	public JPanel control = new TabControl();
	public JPanel cmds = new TabCommands();
	public JPanel output = new TabOutput();
	private PrintStream ps = new PrintStream(new JTextAreaOutputStream(TabOutput.area));
	
	public MainGui()
	{
		Action action = new AbstractAction(){
			private static final long serialVersionUID = -7752490890562696076L;

			@Override
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		};

		//rerooting the output to the JTextArea in the output tab
		System.setOut(ps);
		System.setErr(ps);
		//when pressing the escape button the window closes
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false), "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", action);
		//setting up the tabs
		tabs.addTab("Control", control);
		tabs.addTab("Commands", cmds);
		tabs.addTab("Output", output);
		//adding tooltips to the tabs
		tabs.setToolTipTextAt(0, "General control elements such as enabling or disabling the bot.");
		tabs.setToolTipTextAt(1, "All the commands from the bot to execute.");
		tabs.setToolTipTextAt(2, "Console output. You get focused on this tab when a warning is sent here.");
		add(tabs);
	}
}
