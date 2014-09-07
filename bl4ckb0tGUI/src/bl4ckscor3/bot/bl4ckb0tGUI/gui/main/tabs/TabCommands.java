package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class TabCommands extends JPanel
{
	public static String receiver;
	private Utilities util = new Utilities();
	private JLabel[] label = 
		{
		 new JLabel(), //-bukkit
		 new JLabel(), //-calc
		 new JLabel(), //-cbukkit
		 new JLabel(), //-changenick
		 new JLabel(), //-decide
		 new JLabel(), //-draw
		 new JLabel(), //-forge
		 new JLabel(), //-join
		 new JLabel(), //-kick
		 new JLabel(), //-leave
		 new JLabel(), //-leet
		 new JLabel(), //-longurl
		 new JLabel(), //-letter
		 new JLabel(), //-number
		 new JLabel(), //-scramble
		 new JLabel(), //-select
		 new JLabel(), //-twitch
		 new JLabel()  //chan/user to send to
		};
	public static JTextField[][] text = 
		{
		 {new JTextField()}, //-bukkit
		 {new JTextField()}, //-calc
		 {new JTextField()}, //-cbukkit
		 {new JTextField()}, //-changenick
		 {new JTextField()}, //-decide
		 {}, //-draw (placeholder for the setBounds() algorythm to work)
		 {new JTextField(), new JTextField()}, //-forge
		 {new JTextField()}, //-join
		 {new JTextField(), new JTextField()}, //-kick
		 {new JTextField()}, //-leave
		 {new JTextField()}, //-leet
		 {new JTextField()}, //-longurl
		 {new JTextField()}, //-letter
		 {new JTextField()}, //-number
		 {}, //-scramble (placeholder for the setBounds() algorythm to work)
		 {new JTextField()}, //-select
		 {new JTextField()}, //-twitch
		 {new JTextField()}  //chan/user to send to
		};
	public JButton[] button = 
		{
		 new JButton(), //-bukkit
		 new JButton(), //-calc
		 new JButton(), //-cbukkit
		 new JButton(), //-changenick
		 new JButton(), //-decide
		 new JButton(), //-draw
		 new JButton(), //-forge
		 new JButton(), //-join
		 new JButton(), //-kick
		 new JButton(), //-leave
		 new JButton(), //-leet
		 new JButton(), //-longurl
		 new JButton(), //-letter
		 new JButton(), //-number
		 new JButton(), //-scramble
		 new JButton(), //-select
		 new JButton(), //-twitch
		};
	public static JComboBox[] dropDown = 
		{
		 new JComboBox(), //-calc
		 new JComboBox(), //-draw
		 new JComboBox(), //-scramble
		};

	public TabCommands()
	{
		setLayout(null);

		label[0].setText("-bukkit");
		label[1].setText("-calc");
		dropDown[0].setBounds(130, 40, 110, 20);
		label[2].setText("-cbukkit");
		label[3].setText("-changenick");
		label[4].setText("-decide");
		label[5].setText("-draw");
		dropDown[1].setBounds(130, 120, 110, 20);
		label[6].setText("-forge");
		label[7].setText("-join");
		label[8].setText("-kick");
		label[9].setText("-leave");
		label[10].setText("-leet");
		label[11].setText("-longurl");
		label[12].setText("-letter");
		label[13].setText("-number");
		label[14].setText("-scramble");
		dropDown[2].setBounds(130, 300, 110, 20);
		label[15].setText("-select");
		label[16].setText("-tv");
		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");

		util.setLabelBounds(label);
		util.setTextBounds(text);
		util.setButtonProperties(button, label);
		util.addDropDownTexts(dropDown);
		util.addComponentArray(label, this);
		util.addNestedComponentArray(text, this);
		util.addComponentArray(button, this);
		util.addComponentArray(dropDown, this);
	}
}
