/*
* Blaine Smith 
* 9-09-2019 
* Bellevue University
* Assignment 4.2
* File - nestedLoops.java
* This program will use nested loops to out put a number pattern
*/
package assignment4_2;

public class nestedLoops 
{

	public static void main(String[] args) 
	{
		
		// Printing pattern #1
		for (int i = 1; i < 7; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.printf("%-2d", j);
			}
			System.out.println();
		}
		
		// Making space between the patterns
		System.out.println();
		
		
		// Printing pattern #4
		for (int i = 6; i >= 1; i--) 
		{
			// controlling the number of spaces that are added
		    for (int j = 6; j > i; j--) 
		    {    
		        System.out.print("  ");
		    }
		    
		    // outputting the proper number in the sequence 
		    for (int k = 1; k <= i; k++) 
		    {    
		        System.out.printf("%d ",k);
		    }
		    System.out.println();
		}
		
	}

}
