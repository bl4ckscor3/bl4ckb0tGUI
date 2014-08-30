package bl4ckscor3.bot.bl4ckb0tGUI.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimited extends PlainDocument
{
	private int limit;
	private String[] allowedChars;
	
	public JTextFieldLimited(int limitation, String... allowedChars)
	{
		limit = limitation;
		this.allowedChars = allowedChars;
	}
	
	@Override
	public void insertString(int offset, String s, AttributeSet set) throws BadLocationException
	{
		if(s == null)
			return;
		else if(getLength() + s.length() <= limit)
		{
			for(String str : allowedChars)
			{
				if(s.equals(str))
				{
					super.insertString(offset, s, set);
					break;
				}
			}
		}
	}
}
