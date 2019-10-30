/*
* Blaine Smith 
* 8-26-2019 
* Bellevue University
* Assignment 2.2
* File - FeetToMeters.java
* This program will convert feet to meters through math operations.
*/
package assignment2_2;

import java.util.Scanner;

public class FeetToMeters 
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		double meters = 0.305;
		
		System.out.print("Enter in the value for feet:  ");
		
		//Obtaining the users input for calculations
		double feet = scnr.nextDouble();
		System.out.println("");
		
		//Converting feet to meters
		double totalMeters = feet * meters;
		
		System.out.println(feet + " feet is " + totalMeters + " meters");
		
		//Closing my scanner as to avoid a data leak.
		scnr.close();
	}

}
