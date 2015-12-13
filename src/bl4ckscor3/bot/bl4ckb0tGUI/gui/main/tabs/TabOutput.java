package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

//not used yet, will be later.
public class TabOutput extends JPanel 
{
	private static final long serialVersionUID = -6186699631058070231L;
	public static JTextArea area = new JTextArea();
	private JScrollPane scrollBar = new JScrollPane();
	
	public TabOutput()
	{
		setLayout(null);
		
		//fitting everything into the field
		area.setWrapStyleWord(true);
		area.setLineWrap(true); 
		area.setEditable(false);
		//setting up the scrollbar
		scrollBar.setBounds(9, 9, 770, 725);
		//border
		scrollBar.setBorder(BorderFactory.createTitledBorder("Output"));
		//what the scroll bar affects
		scrollBar.setViewportView(area);
		scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollBar);
	}
}
