//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Piper Spoor

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		System.out.println(ws.toString());

		ws.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.println(ws.toString());

		ws.setList("b x 4 r s y $");
		System.out.println(ws.toString());

		ws.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(ws.toString());
	}
}