/*
* Blaine Smith 
* 8-26-2019 
* Bellevue University
* Assignment 2.3
* File - SumOfDigits.java
* This program will add together the individual digits of a larger number to provide the sum of those digits.
*/
package assignment2_3;

import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner (System.in);
		
		System.out.print("Enter a number between 0 and 1000:  ");
		
		int userNumber = scnr.nextInt();
		
		//Filtering through the userNumber for each individual number
		int firstNumber = userNumber % 10;
		int secondNumber = (userNumber / 10) % 10;
		int thirdNumber = (userNumber / 10 / 10) % 10;
		
		int sum = firstNumber + secondNumber + thirdNumber;
		
		System.out.println("The sum of the digits is " + sum);
		
		//Closing scanner to prevent data leaks
		scnr.close();
		
	}

}
