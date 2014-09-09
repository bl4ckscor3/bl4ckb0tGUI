package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import bl4ckscor3.bot.bl4ckb0tGUI.core.Core;

//not used yet, will be later.
public class TabOutput extends JPanel 
{
	public static JTextArea area = new JTextArea();
	
	public TabOutput()
	{
		setLayout(null);
		
		area.setBounds(9, 9, 770, 725);
		area.setEditable(false);
		add(area);
	}
}
