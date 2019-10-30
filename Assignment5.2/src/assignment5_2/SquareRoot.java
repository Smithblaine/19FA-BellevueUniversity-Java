/*
* Blaine Smith 
* 9-16-2019 
* Bellevue University
* Assignment 5.2
* File - SquareRoot.java
* This program will output a table of numbers that will show the square root of those numbers.
*/
package assignment5_2;

import java.lang.Math;

public class SquareRoot 
{

	public static void main(String[] args) 
	{
		System.out.println("Number" + "\t" + "SquareRoot");
		
		for(int i = 0; i <= 20; i+=2) 
		{
			
			System.out.printf("%-5d%9.4f\n", i, Math.sqrt(i));
			
		}

	}

}
