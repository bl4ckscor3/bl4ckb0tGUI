package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Calculate implements Command
{
	public void exe()
	{
		String[] sNumbers = TabCommands.text[1][1].getText().split(" ");
		String operation = TabCommands.text[1][0].getText();
		float[] numbers = new float[sNumbers.length];
		
		for(int i = 0; i < sNumbers.length; i++)
		{
			numbers[i] = Float.parseFloat(sNumbers[i]);
		}
		
		if(operation.equals("+"))
			add(numbers);
		else if(operation.equals("-"))
			subtract(numbers);
		else if(operation.equals("*") || operation.equals("x"))
			multiply(numbers);
		else if(operation.equals("/"))
			Utilities.sendMessage(TabCommands.receiver, "I'm too dumb to divide :(");
		else if(operation.equals("^"))
			pow(numbers);
		else if(operation.equals("%"))
			modulo(numbers);
		else if(operation.equals("!"))
		{
			if(sNumbers.length > 1)
				Utilities.sendMessage(TabCommands.receiver, "You cannot calulate the factorial of more than one number at a time.");
			else
				Utilities.sendMessage(TabCommands.receiver, "The solution is: " + fact(Integer.parseInt(sNumbers[0])));
		}
	}
	
	private void add(float[] numbers)
	{
		float solution = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			solution += numbers[i];
		}		
		
		checkForIntAndSend(solution);
	}
	
	private void subtract(float[] numbers)
	{
		float solution = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			solution -= numbers[i];
		}

		checkForIntAndSend(solution);
	}
	
	private void multiply(float[] numbers)
	{
		float solution = 1;
		
		for(int i = 0; i < numbers.length; i++)
		{
			solution *= numbers[i];
		}
		
		checkForIntAndSend(solution);
	}
	
	private void pow(float[] numbers)
	{
		double solution = Math.pow(numbers[0], numbers[1]);
		
		checkForIntAndSend((float)solution);
	}
	
	private void modulo(float[] numbers) 
	{
		float solution = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			solution %= numbers[i];
		}
		
		checkForIntAndSend(solution);
	}
	
	private int fact(int i)
	{
		if(i == 1)
			return 1;
		else
			return i * fact(i - 1);
	}
	
	private void checkForIntAndSend(float solution)
	{
		if(Float.toString(solution).endsWith(".0"))
			Utilities.sendMessage(TabCommands.receiver, "The solution is: " + (int)solution);
		else
			Utilities.sendMessage(TabCommands.receiver, "The solution is: " + solution);
	}
	
	@Override
	public String getAlias()
	{
		return "calc";
	}
}
