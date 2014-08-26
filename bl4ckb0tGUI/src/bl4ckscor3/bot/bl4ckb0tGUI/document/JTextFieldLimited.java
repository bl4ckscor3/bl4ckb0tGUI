package bl4ckscor3.bot.bl4ckb0tGUI.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimited extends PlainDocument
{
	private int limit;
	
	public JTextFieldLimited(int limitation)
	{
		limit = limitation;
	}
	
	@Override
	public void insertString(int offset, String s, AttributeSet set) throws BadLocationException
	{
		if(s == null)
			return;
		else if(getLength() + s.length() <= limit)
			super.insertString(offset, s, set);
	}
}
