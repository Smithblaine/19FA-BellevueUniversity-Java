/*
* Blaine Smith 
* 10-7-2019 
* Bellevue University
* Assignment 8.2
* File - BubbleSorting.java
* This program take an array of various number and sorts them from smallest to biggest.
*/
package assignment8_2;

import java.util.Arrays;

public class BubbleSorting 
{

	public static void main(String[] args) 
	{
		int unsorted [] = {9, 32, 7, 6, 17, 4, 3, 2, 1};
		
		System.out.println("Unsorted:  " + Arrays.toString(unsorted));
		
		int [] sorted = Receiver(unsorted);
		
		System.out.println("Sorted:  " + Arrays.toString(sorted));

	}
	
	public static int [] Receiver(int [] mess) 
	{
		int n = mess.length;
        for (int i = 0; i < n-1; i++) 
        {
        	for (int j = 0; j < n-i-1; j++) 
            {
            	if (mess[j] > mess[j+1])
                {
                    int temp = mess[j];
                    mess[j] = mess[j+1];
                    mess[j+1] = temp;
                }
            }
        }
        
        return mess;
	            
	}

}
