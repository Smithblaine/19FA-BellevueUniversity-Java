/*
* Blaine Smith 
* 9-16-2019 
* Bellevue University
* Assignment 5.3
* File - sumDigits.java
* This program will demonstrate how to pass an variable to a method then output the returned value.
*/
package assignment5_3;

import java.util.Scanner;

public class sumDigits 
{

	public static void main (String[] args) 
	{
		Scanner scnr = new Scanner (System.in);
		
		System.out.print("Enter a number greater than 0:  ");
		int userInput = scnr.nextInt();
		
		//passing the users input to the method for calculation. while also streamlining the code in the print statement.
		System.out.printf("The sum of %s's individual digits is: %d", userInput, sumOfDigits(userInput));
		
		scnr.close();
	}
	
	
	public static int sumOfDigits (int userNumber) 
	{
		int total = 0;
		
		//Finding the length of the users number for the for loop to iterate through it.
		int length = Integer.toString(userNumber).length();

		for (int i = 0; i <= length; i++) 
		{
			total += userNumber % 10;
			userNumber /= 10;
		}
		
		return total;
	}

}
