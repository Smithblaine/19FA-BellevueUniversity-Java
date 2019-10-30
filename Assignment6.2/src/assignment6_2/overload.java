/*
* Blaine Smith 
* 9-23-2019 
* Bellevue University
* Assignment 6.2
* File - overload.java
* This program will take the number input from a user and provide them with the difference of the two numbers
*/

package assignment6_2;

import java.util.Scanner;

public class overload {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		//Taking in user input
		System.out.print("Enter your first number:  ");
		float first = scnr.nextFloat();
		
		System.out.print("\nEnter your second number:  ");
		float second = scnr.nextFloat();

		//Getting the results of the user input back into a variable
		float result = (float) diff(first, second);

		//Determining if the user input is a integer or a double so that the right string can be used for displaying output.
		if(result == Math.floor(result)) 
		  {
			  System.out.printf("\nThe difference of %d and %d is %d", (int) first, (int) second, (int) result ); 
		  }
		  else if (first == Math.floor(first) && second != Math.floor(second))
		  {
			  System.out.printf("\nThe difference of %d and %.1f is %.1f", (int) first, second, result ); 
		  }
		  else if (first != Math.floor(first) && second == Math.floor(second)) 
		  {
			  System.out.printf("\nThe difference of %.1f and %d is %.1f", first, (int) second, result ); 
		  }
		  else 
		  {
			  System.out.printf("\nThe difference of %.1f and %.1f is %.1f", first, second,result );
		  }
		  
		scnr.close();
	}

	public static int diff(int a, int b) 
	{
		int max = Math.max(a, b);
		int low = Math.min(a, b);

		return max - low;
	}

	public static double diff(double a, double b) 
	{
		double max = Math.max(a, b);
		double low = Math.min(a, b);

		return max - low;
	}

	public static double diff(int a, double b) 
	{
		double max = Math.max(a, b);
		double low = Math.min(a, b);

		return max - low;
	}

	public static double diff(double a, int b) 
	{
		double max = Math.max(a, b);
		double low = Math.min(a, b);

		return max - low;
	}

}
