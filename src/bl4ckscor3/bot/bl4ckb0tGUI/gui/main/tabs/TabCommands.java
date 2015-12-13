package bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bl4ckscor3.bot.bl4ckb0tGUI.listener.CommandButtonListener;
import bl4ckscor3.bot.bl4ckb0tGUI.util.CommandPositions;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class TabCommands extends JPanel
{
	private static final long serialVersionUID = 8161413868335482169L;
	public static String receiver;
	private Utilities util = new Utilities();
	private JLabel[] label = 
		{
				new JLabel(), //-calc
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
				new JLabel(), //-tv
				new JLabel(), //-tw
				new JLabel(), //-vowels
				new JLabel(), //-w
				new JLabel(), //-xcolor
				new JLabel(), //-yt
				new JLabel()  //chan/user to send to
		};
	public static JTextField[][] text = 
		{
				{new JTextField()}, //-calc
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
				{new JTextField()}, //-tv
				{new JTextField()}, //-tw
				{new JTextField()}, //-vowels
				{new JTextField()}, //-w
				{}, //-xcolor
				{new JTextField()}, //-yt
				{new JTextField()}  //chan/user to send to
		};
	public JButton[] button = 
		{
				new JButton(), //-calc
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
				new JButton(), //-tv
				new JButton(), //-tw
				new JButton(), //-vowels
				new JButton(), //-w
				new JButton(), //-xcolor
				new JButton()  //-yt
		};
	public static JComboBox<?>[] dropDown = 
		{
				new JComboBox<String>(), //-calc
				new JComboBox<String>(), //-draw
				new JComboBox<Integer>(), //-scramble
		};

	public TabCommands()
	{
		setLayout(null);

		//setting the text for the labels
		label[CommandPositions.calc].setText("-calc");
		dropDown[0].setBounds(130, 20, 110, 20);
		label[CommandPositions.changenick].setText("-changenick");
		label[CommandPositions.decide].setText("-decide");
		label[CommandPositions.draw].setText("-draw");
		dropDown[1].setBounds(130, 80, 110, 20);
		label[CommandPositions.forge].setText("-forge");
		label[CommandPositions.join].setText("-join");
		label[CommandPositions.kick].setText("-kick");
		label[CommandPositions.leave].setText("-leave");
		label[CommandPositions.leet].setText("-leet");
		label[CommandPositions.longurl].setText("-longurl");
		label[CommandPositions.letter].setText("-letter");
		label[CommandPositions.number].setText("-number");
		label[CommandPositions.scramble].setText("-scramble");
		dropDown[2].setBounds(130, 260, 110, 20);
		label[CommandPositions.select].setText("-select");
		label[CommandPositions.twitch].setText("-tv");
		label[CommandPositions.twitter].setText("-tw");
		label[CommandPositions.vowels].setText("-vowels");
		label[CommandPositions.weather].setText("-w");
		label[CommandPositions.xcolor].setText("-xcolor");
		label[CommandPositions.youtube].setText("-yt");
		label[label.length - 1].setText("Channel/User to send the message to (if available for the given command). Don't forget the '#' when sending to a channel!");
		//needs to be set early, because else the commands wont be in the linked list
		util.setButtonProperties(button, label);

		//adding the tooltips to the labels (help)
		for(int i = 0; i < CommandPositions.commandAmount; i++)
		{
			label[i].setToolTipText(CommandButtonListener.commands.get(i).getTooltip());
		}

		//finalizing the properties of some components and adding everything to the gui
		util.setLabelBounds(label);
		util.setTextBounds(text);
		util.addDropDownTexts(dropDown);
		util.addComponentArray(label, this);
		util.addNestedComponentArray(text, this);
		util.addComponentArray(button, this);
		util.addComponentArray(dropDown, this);
	}
}
