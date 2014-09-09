package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

//not used yet, will be later.
public class TabOutput extends JPanel 
{
	public static JTextArea area = new JTextArea();
	private JScrollPane scrollBar = new JScrollPane();
	
	public TabOutput()
	{
		setLayout(null);
		
		area.setWrapStyleWord(true);
		area.setLineWrap(true); 
		area.setEditable(false);
		scrollBar.setBounds(9, 9, 770, 725);
		scrollBar.setBorder(BorderFactory.createTitledBorder("Output"));
		scrollBar.setViewportView(area);
		scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollBar);
	}
}
