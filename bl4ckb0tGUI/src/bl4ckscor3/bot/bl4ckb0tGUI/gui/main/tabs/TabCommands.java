package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.commands.Draw;
import bl4ckscor3.bot.bl4ckb0tGUI.document.JTextFieldLimited;
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
			new JLabel()  //chan/user to send to
		};
	public static JTextField[][] text = 
		{
			new JTextField[]{new JTextField()}, //-bukkit
			new JTextField[]{new JTextField(), new JTextField()}, //-calc
			new JTextField[]{new JTextField()}, //-cbukkit
			new JTextField[]{new JTextField()}, //-changenick
			new JTextField[]{new JTextField()}, //-decide
			new JTextField[]{}, //-draw (placeholder for the setBounds() algorythm to work
			new JTextField[]{new JTextField(), new JTextField()}, //-forge
			new JTextField[]{new JTextField()}, //-join
			new JTextField[]{new JTextField(), new JTextField()}, //-kick
			new JTextField[]{new JTextField()}, //-leave
			new JTextField[]{new JTextField()}  //chan/user to send to
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
		};
	public static JComboBox<String> dropDown = new JComboBox<String>();

	public TabCommands()
	{
		setLayout(null);

		label[0].setText("-bukkit");
		button[0].setText(Utilities.getButtonText(0, label));

		label[1].setText("-calc");
		text[1][0].setDocument(new JTextFieldLimited(1, "+", "-", "*", "/", "^", "%", "!"));
		button[1].setText(Utilities.getButtonText(1, label));

		label[2].setText("-cbukkit");
		button[2].setText(Utilities.getButtonText(2, label));

		label[3].setText("-changenick");
		button[3].setText(Utilities.getButtonText(3, label));

		label[4].setText("-decide");
		button[4].setText(Utilities.getButtonText(4, label));

		label[5].setText("-draw");
		dropDown.setBounds(130, 120, 110, 20);
		addDropDownTexts();
		button[5].setText(Utilities.getButtonText(5, label));

		label[6].setText("-forge");
		button[6].setText(Utilities.getButtonText(6, label));
		
		label[7].setText("-join");
		button[7].setText(Utilities.getButtonText(7, label));

		label[8].setText("-kick");
		button[8].setText(Utilities.getButtonText(8, label));

		label[9].setText("-leave");
		button[9].setText(Utilities.getButtonText(9, label));
		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");

		util.setLabelBounds(label);
		util.setTextBounds(text);
		util.setButtonBounds(button);
		util.addComponentArray(label, this);
		util.addNestedComponentArray(text, this);
		util.addComponentArray(button, this);
		add(dropDown);
	}

	private void addDropDownTexts()
	{
		for(String s : Draw.drawings)
		{
			dropDown.addItem(s);
		}
	}
}
