//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Piper Spoor

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int nextLargest = 0;
		for(int val : numArray){
			if(val > searchNum){
				if(nextLargest == 0 || val < nextLargest){
					nextLargest = val;
				}
			}
		}
		return nextLargest;
	}
}