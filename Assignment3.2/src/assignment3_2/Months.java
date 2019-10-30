/*
* Blaine Smith 
* 9-01-2019 
* Bellevue University
* Assignment 3.2
* File - Months.java
* This program will randomly generate a number and assign it to the correct month that it is associated with.
*/
package assignment3_2;

public class Months 
{

	public static void main(String[] args) 
	{
		//Creating the random number then adding 3 to give it a range of 1 thru 12.
		int monthNumber = (int) (Math.random() * 12) + 1;
		
		System.out.print("The " + monthNumber + " month is ");
		
		if (monthNumber == 1) 
		{
			System.out.print("January");
		}
		else if (monthNumber == 2) 
		{
			System.out.print("February");
		}
		else if (monthNumber == 3) 
		{
			System.out.print("March");
		}
		else if (monthNumber == 4) 
		{
			System.out.print("April");
		}
		else if (monthNumber == 5) 
		{
			System.out.print("May");
		}
		else if (monthNumber == 6) 
		{
			System.out.print("June");
		}
		else if (monthNumber == 7) 
		{
			System.out.print("July");
		}
		else if (monthNumber == 8) 
		{
			System.out.print("August");
		}
		else if (monthNumber == 9) 
		{
			System.out.print("September");
		}
		else if (monthNumber == 10) 
		{
			System.out.print("October");
		}
		else if (monthNumber == 11) 
		{
			System.out.print("November");
		}
		else if (monthNumber == 12) 
		{
			System.out.print("December");
		}
	}

}
