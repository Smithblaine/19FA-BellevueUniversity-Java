/*
* Blaine Smith 
* 9-09-2019 
* Bellevue University
* Assignment 4.2
* File - letterGrade.java
* This program will allow the user to enter in a letter and show that grade for the letter selected.
*/
package assignment4_3;

import java.util.Scanner;

public class letterGrade 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner (System.in);
		String input;
		
		do {
			
			System.out.print("Enter a letter grade:  ");
			input = scnr.next();
			input.toLowerCase();
			
			if(input.contains("a")) 
			{
				System.out.println("The numeric value for grade A is 4");
			}
			else if(input.contains("b")) 
			{
				System.out.println("The numeric value for grade B is 3");
			}
			else if (input.contains("c")) 
			{
				System.out.println("The numeric value for grade C is 2");
			}
			else if (input.contains("d"))
			{
				System.out.println("The numeric value for grade D is 1");
			}
			else if (input.contains("f"))
			{
				System.out.println("The numeric value for grade F is 0");
			}
			

		// I learned the use of .contains() while writing Java automation
		} while (input.contains("a") || input.contains("b") || input.contains("c") || input.contains("d") || input.contains("f"));
		
		System.out.print(input.toUpperCase() + " is an invalid grade");
		scnr.close();
	}
	
}
