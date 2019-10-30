/*
* Blaine Smith 
* 9-01-2019 
* Bellevue University
* Assignment 3.3
* File - Palindrome.java
* This program will determine if the user's number is a Palindrome number.
*/
package assignment3_3;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner (System.in);
		
		System.out.print("Enter a three-digit integer:  ");
		
		int userNumber  = scnr.nextInt();
		
		//Finding the first and last number from the user's input
		int firstNumber = userNumber % 10;
		int thirdNumber = (userNumber / 10 / 10) % 10;
		
		//Using the first and last number of the user's input to check if they are the same.
		if (firstNumber == thirdNumber) {
			System.out.println(userNumber + " is a palindrome");
		}
		else {
			System.out.println(userNumber + " is not a palindrome");
		}
		
		scnr.close();

	}

}
