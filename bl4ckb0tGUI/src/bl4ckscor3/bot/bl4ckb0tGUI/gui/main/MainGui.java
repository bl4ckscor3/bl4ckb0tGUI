package bl4ckscor3.bot.bl4ckb0tGUI.gui.main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.WarningGui;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabControl;
import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabOutput;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class MainGui extends JFrame
{
	private JTabbedPane tabs = new JTabbedPane();
	public JPanel control = new TabControl();
	public JPanel cmds = new TabCommands();
	public JPanel output = new TabOutput();

	public MainGui()
	{
		Action action = new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		};

		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false), "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", action);
		tabs.addTab("Control", control);
		tabs.addTab("Commands", cmds);
		tabs.addTab("Output", output);
		add(tabs);
	}
}
