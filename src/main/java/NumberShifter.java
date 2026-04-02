//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Piper Spoor

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		//You will need to use Math.random()
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = (int)(Math.random()*10);
		}
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		int countSwitch = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == 7){
				int valSwitch = array[countSwitch];
				array[countSwitch] = 7;
				countSwitch++;
				array[i] = valSwitch;
			}
		}
	}
}