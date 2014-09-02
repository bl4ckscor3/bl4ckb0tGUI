package bl4ckscor3.bot.bl4ckb0tGUI.commands;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0tGUI.gui.main.tabs.TabCommands;
import bl4ckscor3.bot.bl4ckb0tGUI.util.Utilities;

public class Draw implements ICommand
{
	public static String[] drawings =
		{
		"smiley",
		"mario",
		"batman",
		"bullshit",
		"bunny",
		"cat",
		"chick",
		"fly",
		"invaders",
		"megaman",
		"phone",
		"superman",
		"stormtrooper",
		};

	@Override
	public void exe()
	{
		switch((String)TabCommands.dropDown.getSelectedItem())
		{
			case "smiley":
				smiley();
				break;
			case "mario":
				mario();
				break;
			case "batman":
				batman();
				break;
			case "bullshit":
				bullshit();
				break;
			case "bunny":
				bunny();
				break;
			case "cat":
				cat();
				break;
			case "chick":
				chick();
				break;
			case "fly":
				fly();
				break;
			case "invaders":
				invaders();
				break;
			case "megaman":
				megaman();
				break;
			case "phone":
				phone();
				break;
			case "superman":
				superman();
				break;
			case "stormtrooper":
				stormtrooper();
				break;
			default:
				System.out.println("Invalid dropdown item");
		}
	}
	
	private void smiley()
	{
		Utilities.sendMessage(TabCommands.receiver, "1,1          1,1          1,1          ");
		Utilities.sendMessage(TabCommands.receiver, "1,1      1,1    8,8          1,1    1,1      ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    1,1  8,8                  1,1  1,1    ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  1,1  8,8    1,1    8,8      1,1    8,8    1,1  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  1,1  8,8  1,1  8,8    1,1  8,8  1,1  8,8    1,1  8,8  1,1  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  8,8                          1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  8,8  1,1                      8,8  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  8,8  1,1  0,0  15,15  1,1  0,0    15,15  1,1  0,0  15,15  1,1  8,8  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  8,8  1,1  0,0  15,15  1,1  0,0    15,15  1,1  0,0  15,15  1,1  8,8  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  8,8  1,1  0,0  15,15  1,1  0,0    15,15  1,1  0,0  15,15  1,1  8,8  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  1,1  8,8  1,1  15,15  1,1  0,0    15,15  1,1  0,0  1,1  8,8  1,1  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  1,1  8,8    1,1    0,0    15,15  1,1    8,8    1,1  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    1,1  8,8    1,1          8,8    1,1  1,1    ");
		Utilities.sendMessage(TabCommands.receiver, "1,1      1,1    8,8          1,1    1,1      ");
		Utilities.sendMessage(TabCommands.receiver, "1,1          1,1          1,1          ");
	}

	private void mario()
	{
		Utilities.sendMessage(TabCommands.receiver, "1,1                ");
		Utilities.sendMessage(TabCommands.receiver, "1,1     4,4     1,1      ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    4,4         1,1   ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    5,5   7,7  5,5 7,7 1,1     ");
		Utilities.sendMessage(TabCommands.receiver, "1,1   5,5 7,7 5,5 7,7   5,5 7,7   1,1   ");
		Utilities.sendMessage(TabCommands.receiver, "1,1   5,5 7,7 5,5  7,7   5,5 7,7   1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1   5,5  7,7    5,5    1,1   ");
		Utilities.sendMessage(TabCommands.receiver, "1,1     7,7       1,1    ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    5,5  4,4 5,5   1,1      ");
		Utilities.sendMessage(TabCommands.receiver, "1,1   5,5   4,4 5,5  4,4 5,5   1,1   ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  5,5    4,4    5,5    1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  7,7  5,5 4,4 7,7 4,4  7,7 4,4 5,5 7,7  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  7,7   4,4      7,7   1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  7,7  4,4        7,7  1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1    4,4   1,1  4,4   1,1    ");
		Utilities.sendMessage(TabCommands.receiver, "1,1   5,5   1,1    5,5   1,1   ");
		Utilities.sendMessage(TabCommands.receiver, "1,1  5,5    1,1    5,5    1,1  ");
		Utilities.sendMessage(TabCommands.receiver, "1,1                ");
	}

	private void batman()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              1,1              0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          1,1    8,8              1,1    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        1,1  8,8                      1,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      1,1  8,8    1,1  8,8    1,1  8,8  1,1  8,8    1,1  8,8    1,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    1,1  8,8    1,1  8,8      1,1      8,8      1,1  8,8    1,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8    1,1    8,8      1,1      8,8      1,1    8,8    1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8  1,1        8,8  1,1          8,8  1,1        8,8  1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8  1,1                              8,8  1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8  1,1                              8,8  1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8  1,1                              8,8  1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8  1,1                              8,8  1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  1,1  8,8    1,1    8,8  1,1  8,8  1,1      8,8  1,1  8,8  1,1    8,8    1,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    1,1  8,8    1,1  8,8        1,1  8,8        1,1  8,8    1,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      1,1  8,8    1,1  8,8      1,1  8,8      1,1  8,8    1,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        1,1  8,8                      1,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          1,1    8,8              1,1    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              1,1              0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                          ");
	}

	private void bullshit()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  14,14  0,0              14,14  0,0                              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  14,14  0,0      1,1        14,14  1,1                    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,14    0,1          0,14    0,0    0,14                0,1      0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,14      0,0    0,1  0,0      0,14                0,1  0,5  0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,14  0,1  0,0  0,1  0,0  0,1  0,0      0,14                0,1  0,5  0,0  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,0  0,1  0,0  0,1  0,0  0,1  0,0        0,14            0,0  0,1  0,5  0,0  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1              0,0          0,14      0,0      0,1  0,0    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,13            0,1    0,0                0,14    0,1  0,0    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,13              0,1  0,0    0,14        0,0    0,14    0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,13  0,5  0,13      0,5  0,13  0,1  0,0  0,14            0,0      0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,13  0,5  0,13  0,5  0,13    0,1  0,14                0,0  0,1    0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1                                  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,0      0,1  0,0      0,13          0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,0      0,1  0,0        0,13      0,0  0,1  0,0    0,5  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,0      0,1  0,0          0,1  0,0    0,1  0,0  0,5      0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,0      0,1  0,0          0,1  0,0    0,1  0,5          0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,3                                                ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
	}

	private void bunny()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1      0,0                    0,1      0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,15  0,0    0,1  0,0                0,1  0,0    0,15  0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,15  0,13    0,0  0,1  0,0            0,1  0,0  0,13    0,15  0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,15    0,13  0,0  0,1  0,0            0,1  0,0  0,13  0,15    0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,15  0,13    0,0  0,1  0,0        0,1  0,0  0,13    0,15  0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1  0,15  0,13  0,0  0,1  0,0        0,1  0,0  0,13  0,15  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,13  0,0  0,1        0,0  0,13  0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1      0,15        0,1      0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,15  0,0            0,15  0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,0                0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,0                0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,0  0,1  0,0        0,1  0,0  0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,0  0,1  0,0        0,1  0,0  0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,15  0,13    0,0        0,13    0,15  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1      0,15                0,1      0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,1        0,0    0,1                    0,0    0,1          ");
		Utilities.sendMessage(TabCommands.receiver, "0,3      0,1  0,15      0,1  0,3            0,1  0,15      0,1  0,3        ");
		Utilities.sendMessage(TabCommands.receiver, "0,3        0,1      0,3                0,1      0,3          ");
		Utilities.sendMessage(TabCommands.receiver, "0,3                                              ");
		Utilities.sendMessage(TabCommands.receiver, "0,3                                              ");
	}

	private void cat()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1    0,0                      0,1    0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7    0,1  0,0                  0,1  0,7    0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7      0,1  0,0              0,1  0,7      0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7  0,5  0,7    0,1  0,0          0,1  0,7    0,5  0,7  0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7  0,5    0,7    0,1          0,7    0,5    0,7  0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7  0,5    0,7    0,5  0,7  0,5  0,7  0,5  0,7    0,5    0,7  0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,7            0,5  0,7  0,5  0,7  0,5  0,7            0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,5    0,7                          0,5    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,7      0,1    0,0  0,7          0,1    0,0  0,7      0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,5    0,7  0,1      0,7  0,1  0,13  0,1  0,7  0,1      0,7  0,5    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,7      0,1      0,7  0,1      0,7  0,1      0,7      0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,5    0,7                          0,5    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,7          0,1  0,7    0,1  0,7    0,1  0,7          0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,7        0,1              0,7        0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,7                          0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1                          0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                          ");
	}

	private void chick()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                0,1                  0,0                ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,8                  0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,8                      0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8                          0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8                          0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8    0,0  0,1  0,8          0,0  0,1  0,8    0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8    0,1    0,8          0,1    0,8    0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8    0,1    0,8          0,1    0,8    0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8          0,1      0,8          0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1    0,8        0,1  0,7      0,1  0,8        0,1    0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,8              0,1      0,8              0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,8                                      0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,8    0,1  0,8          0,0          0,8        0,1    0,8    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1    0,0  0,1  0,8      0,0              0,8      0,1  0,0  0,1    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8      0,0              0,8      0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8      0,0              0,8      0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8          0,0      0,8          0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,8  0,1      0,8  0,1      0,8  0,1      0,8  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,7      0,1  0,0      0,1  0,7      0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1      0,0          0,1      0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");

	}

	private void fly()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,14      0,0                                      0,14        0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,14  0,0      0,14    0,0          0,1            0,0          0,14  0,0        0,14  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,14  0,0          0,14  0,0    0,1      0,14    0,15      0,1    0,0    0,14  0,0          0,14  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,14  0,15  0,0        0,14  0,0  0,1      0,14    0,15            0,1  0,0  0,14  0,0        0,15  0,14  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,14  0,15    0,0      0,1        0,14        0,15          0,1  0,15  0,0    0,15    0,14  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,14    0,15      0,1          0,14        0,15      0,14  0,1  0,15      0,14    0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,14    0,1                  0,14            0,1  0,14    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1    0,0        0,1        0,0        0,14  0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,0            0,1    0,0            0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,0    0,1  0,15  0,0    0,1    0,0    0,1  0,15  0,0    0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,0    0,1    0,0    0,1    0,0    0,1    0,0    0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1    0,0            0,1    0,0            0,1    0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,0  0,1  0,0        0,1        0,0        0,1  0,0  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,0  0,1                            0,0  0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1    0,0    0,1                        0,0    0,1    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1          0,0    0,1          0,0                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1  0,0    0,1            0,0    0,1  0,0                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                0,1    0,0                    0,1    0,0                ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                            ");

	}

	private void invaders()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                                                            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                          0,1            0,0                                      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                  0,1          0,5        0,1          0,0                              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1      0,0        0,1      0,0      0,1      0,5      0,4        0,5      0,1      0,0        0,1            0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,12  0,1  0,0        0,1  0,12  0,1  0,0      0,1  0,5    0,4                    0,5    0,1  0,0      0,1    0,3        0,1    0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1    0,12  0,1        0,12  0,1    0,0      0,1  0,5  0,4      0,1    0,4    0,1    0,4      0,5  0,1  0,0    0,1    0,3  0,9        0,3  0,1    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1    0,12  0,11  0,12        0,11  0,12  0,1    0,0    0,1  0,5  0,4                        0,5  0,1  0,0  0,1    0,3  0,9            0,3  0,1    0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1    0,12  0,11  0,1  0,11        0,1  0,11  0,12  0,1    0,0  0,1          0,4    0,1    0,4    0,1          0,0  0,1  0,3  0,9  0,1  0,9        0,1  0,9  0,3  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1    0,11    0,1  0,11        0,1  0,11    0,1    0,0          0,1  0,4    0,1    0,4    0,1  0,0          0,1  0,3  0,9  0,1  0,9        0,1  0,9  0,3  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,12  0,11                    0,12  0,1  0,0  0,1        0,4    0,1  0,4    0,1  0,4    0,1        0,0  0,1  0,3  0,9                0,3  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,11  0,1  0,11                0,1  0,11  0,1  0,0  0,1  0,5  0,4    0,1                0,4    0,5  0,1  0,0  0,1      0,9  0,1        0,9  0,1      0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,11  0,1  0,11  0,1            0,11  0,1  0,11  0,1  0,0  0,1          0,0            0,1          0,0  0,1    0,9  0,1  0,9        0,1  0,9  0,1    0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1        0,11    0,1    0,11    0,1        0,0                                    0,1  0,3  0,1  0,9  0,1  0,9    0,1  0,9  0,1  0,3  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1      0,0    0,1      0,0                                            0,1  0,0  0,1  0,0  0,1    0,0  0,1  0,0  0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                                                            ");
	}

	private void megaman()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                                              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                      0,1      0,0                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1      0,11    0,1  0,0                ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                0,1  0,12      0,1  0,11    0,1  0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,12          0,1        0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,12          0,1  0,11    0,12  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,11  0,12            0,1    0,12  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,11  0,12    0,15  0,0      0,12    0,0  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,11  0,12  0,15  0,0    0,1    0,15  0,1  0,0  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,1  0,12  0,15  0,0    0,1    0,15  0,1  0,0  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1    0,12  0,15    0,0      0,15  0,0    0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1    0,11    0,1  0,2  0,15  0,1        0,15  0,1      0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,12  0,11        0,1  0,15          0,1  0,11    0,12  0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1  0,12    0,11        0,1          0,11    0,12    0,1  0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,12      0,11  0,1  0,11              0,1  0,11  0,12      0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,12    0,1      0,11              0,1      0,12    0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,12      0,1    0,11              0,1    0,12      0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1  0,12      0,1    0,12              0,1    0,12      0,1  0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,1      0,0  0,1  0,12              0,1  0,0  0,1      0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,1  0,11    0,12        0,11      0,1  0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,1  0,12    0,11      0,1  0,11        0,12  0,1  0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,1    0,12      0,11  0,1  0,0  0,1  0,11  0,12      0,1    0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1    0,12          0,1  0,0      0,1  0,12          0,1    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,12              0,1  0,0      0,1  0,12              0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1                  0,0      0,1                  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                              ");
	}

	private void phone()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,0                            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                0,1      0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,1  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1                    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10                    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0  0,1            0,0  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0  0,1  0,14        0,1  0,0  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0  0,1  0,14        0,1  0,0  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0  0,1  0,14        0,1  0,0  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0  0,1            0,0  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1  0,15  0,1  0,15    0,1  0,15  0,1  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1  0,15  0,1  0,15    0,1  0,15  0,1  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1  0,15  0,1  0,15    0,1  0,15  0,1  0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,1                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10  0,0                0,10  0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,1  0,10                    0,1  0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,1                    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                            ");
	}

	private void superman()
	{

		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,12                                  0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,12    0,4                              0,12    0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,12    0,4      0,8  0,4    0,8        0,4    0,8  0,4        0,12    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,12    0,4      0,8  0,4    0,8            0,4      0,8  0,4      0,12    0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0  0,12    0,4    0,8    0,4    0,8                      0,4    0,12    0,0  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0    0,12    0,4    0,8  0,4                      0,8    0,4  0,12    0,0    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0      0,12    0,4                              0,12    0,0      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0        0,12    0,4    0,8              0,4        0,12    0,0        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0          0,12    0,4      0,8  0,4  0,8      0,4      0,12    0,0          ");
		Utilities.sendMessage(TabCommands.receiver, "0,0            0,12    0,4                  0,12    0,0            ");
		Utilities.sendMessage(TabCommands.receiver, "0,0              0,12    0,4    0,8      0,4    0,12    0,0              ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                0,12    0,4    0,8  0,4    0,12    0,0                ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                  0,12    0,4      0,12    0,0                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                    0,12    0,4  0,12    0,0                    ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                      0,12      0,0                      ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                        0,12  0,0                        ");
		Utilities.sendMessage(TabCommands.receiver, "0,0                                                  ");
	}

	private void stormtrooper()
	{
		Utilities.sendMessage(TabCommands.receiver, "0,14                                  ");
		Utilities.sendMessage(TabCommands.receiver, "0,14          0,1              0,14          ");
		Utilities.sendMessage(TabCommands.receiver, "0,14        0,1  0,0          0,15    0,1  0,14        ");
		Utilities.sendMessage(TabCommands.receiver, "0,14      0,1  0,0              0,15    0,1  0,14      ");
		Utilities.sendMessage(TabCommands.receiver, "0,14      0,1  0,0                0,15  0,1  0,14      ");
		Utilities.sendMessage(TabCommands.receiver, "0,14      0,1                      0,14      ");
		Utilities.sendMessage(TabCommands.receiver, "0,14      0,1  0,0                0,15  0,1  0,14      ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1  0,0  0,1      0,0      0,1      0,15  0,1  0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1  0,0  0,1    0,0          0,1    0,15  0,1  0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1  0,0        0,1      0,0      0,15  0,1  0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1  0,0        0,1      0,0      0,15  0,1  0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1    0,0    0,1          0,0    0,1    0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14  0,1  0,15    0,0  0,1    0,15      0,1    0,0  0,15    0,1  0,14  ");
		Utilities.sendMessage(TabCommands.receiver, "0,14  0,1  0,0                          0,1  0,14  ");
		Utilities.sendMessage(TabCommands.receiver, "0,14  0,1  0,0    0,1  0,0  0,15  0,1      0,0    0,1  0,0  0,15  0,1  0,14  ");
		Utilities.sendMessage(TabCommands.receiver, "0,14    0,1  0,0    0,15  0,1          0,0    0,15  0,1  0,14    ");
		Utilities.sendMessage(TabCommands.receiver, "0,14      0,1        0,14      0,1        0,14      ");
		Utilities.sendMessage(TabCommands.receiver, "0,14                                  ");
	}

	@Override
	public String getAlias()
	{
		return "draw";
	}
}
