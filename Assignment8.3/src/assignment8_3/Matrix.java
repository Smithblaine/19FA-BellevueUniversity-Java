/*
* Blaine Smith 
* 10-7-2019 
* Bellevue University
* Assignment 8.3
* File - Matrix.java
* This program take an array of 1's and 0's then give the user the index at which has the greatest number of 1's
*/
package assignment8_3;

import java.util.Random;

public class Matrix 
{

	public static void main(String[] args) 
	{
		//Creating a two-dimensional array.
		int doubleMatrix [] [] = new int [4][4];
		
		addNumbers(doubleMatrix);
		System.out.println();
		rowCount(doubleMatrix);		
		colCount(doubleMatrix);
		

	}
	
	public static void colCount(int matrixCol [][]) 
	{
		int total = 0;
		int index = 0;
		
		for (int r = 0; r < matrixCol.length; r++) 
		{
			int sum = 0;
			
			for (int c = r; c <= matrixCol[c][r]; c++) 
			{
				sum += matrixCol[c][r];
				
				if (sum > total || sum == total) 
				{
					total = sum;
					index = c;
				}
				
			}
		}
		System.out.println("The largest column index is:  " + index);
	}
	
	
	
	public static void rowCount(int matrixRow [][])
	{
		int total = 0;
		int index = 0;
		
		for (int r = 0; r < matrixRow.length; ++r) 
		{
			int sum = 0;
			
			for (int c = 0; c < matrixRow[r].length; c++) 
			{
				sum += matrixRow[r][c];
				
				if (sum > total || sum == total) 
				{
					total = sum;
					index = r;
				}
			}
		}
		
		System.out.println("The largest row index is:  " + index);
	}
	
	
	public static void addNumbers(int arr [][]) 
	{
		//Going through the tow dimensional array and adding the values.
		for (int r = 0; r < arr.length; r++) 
		{
			for (int c = 0; c < arr[r].length; c++) 
			{
				arr[r][c] += new Random().nextInt(2);
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

}
