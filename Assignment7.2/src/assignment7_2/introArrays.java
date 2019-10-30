/*
* Blaine Smith 
* 9-30-2019 
* Bellevue University
* Assignment 7.2
* File - introArrays.java
* This program shows the basic use of looping through an array and printing the values inside that array.
*/
package assignment7_2;

public class introArrays 
{

	public static void main(String[] args) 
	{
		//Initializing an array variable with the following numbers
		//Arrays start at 0 for their index, this means that 1 is at index 0 and 72 is at 7.
		//All together there are 8 numbers in the array
		int ranNumbers [] = {1, 12, 15, 90, 100, 40, 59, 72};
		
		//Using a for loop I can loop through each number of the array
		//So while i is less than the total length of my array it will finish the loop by adding 1 to i
		//As the loop goes through the array, I used a print statement with ranNumbers[i], This prints the value at that index.
		for (int i = 0; i < ranNumbers.length; i++) 
		{
			System.out.println("At index "+ i + " is " + ranNumbers[i]);
		}
		

	}

}
