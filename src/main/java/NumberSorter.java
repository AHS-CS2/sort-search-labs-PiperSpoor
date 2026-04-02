//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Piper Spoor

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown
	private static int getNumDigits(int number)
	{
		int count = 0;
		int currentNum = number;
		while(currentNum != 0){
			count++;
			currentNum = (int)(currentNum / 10);
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int val = 0;
		int currentNum = number;
		int[] sorted = new int[getNumDigits(number)];
		for(int i = 0; i < sorted.length; i++){
			sorted[i] = currentNum % 10;
			val = (int)(currentNum / 10);
			currentNum = val;
		}
		Arrays.sort(sorted);
		return sorted;
	}
}