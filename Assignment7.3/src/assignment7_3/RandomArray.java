/*
* Blaine Smith 
* 9-30-2019 
* Bellevue University
* Assignment 7.3
* File - RandomArray.java
* This program adds values 0-9 to an array that are then shown their index values and corresponding number value to the user.
*/
package assignment7_3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray 
{

	public static void main(String[] args) 
	{
		//Initializing an array length of 100
		int randArray [] = new int [100];
		int counter [] = new int [10];

		
		//Looping through my array to add the values to the array
		for (int i = 0; i < randArray.length; i++) 
		{
			//Generating a random number from 0 to 9
			randArray[i] = new Random().nextInt(10);
			
			if(randArray[i] == 0) 
			{
				counter[0]++;
			}
			else if(randArray[i] == 1) 
			{
				counter[1]++;
			}
			else if(randArray[i] == 2) 
			{
				counter[2]++;
			}
			else if(randArray[i] == 3) 
			{
				counter[3]++;
			}
			else if(randArray[i] == 4) 
			{
				counter[4]++;
			}
			else if(randArray[i] == 5) 
			{
				counter[5]++;
			}
			else if(randArray[i] == 6) 
			{
				counter[6]++;
			}
			else if(randArray[i] == 7) 
			{
				counter[7]++;
			}
			else if(randArray[i] == 8) 
			{
				counter[8]++;
			}
			else if(randArray[i] == 9) 
			{
				counter[9]++;
			}
			//sorting the array to make counting easier
			Arrays.sort(randArray);
		}
		
		for (int b = 0; b < counter.length; b++) 
		{
			System.out.println(b + "'s occurrence is: " + counter[b]);
		}

	}

}

