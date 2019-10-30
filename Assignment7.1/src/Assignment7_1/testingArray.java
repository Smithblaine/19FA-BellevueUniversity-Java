package Assignment7_1;

import java.lang.reflect.Array;

public class testingArray 
{

	public static void main(String[] args) 
	{
		//Initializing the array with values
		int a [] = { 1, 2, 3, 4, 5, 6, 7 };
		
		//Putting the value of the array length into variable b
		int b = Array.getLength(a);
		
		//Using the variable b to loop through the 
		for(int c = 0; c <= b; c++) 
		{
			System.out.println("The array length is " + c);
		}
		
	}

}
