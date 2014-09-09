package bl4ckscor3.bot.bl4ckb0tGUI.output;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

public class JTextAreaOutputStream extends OutputStream
{
	private JTextArea area;
	
	public JTextAreaOutputStream(JTextArea area)
	{
		this.area = area;
	}
	
	@Override
	public void write(int b) throws IOException
	{
		area.append(String.valueOf((char) b));
		area.setCaretPosition(area.getDocument().getLength());
	}
}
