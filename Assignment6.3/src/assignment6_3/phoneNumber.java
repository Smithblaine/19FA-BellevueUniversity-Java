/*
* Blaine Smith 
* 9-23-2019 
* Bellevue University
* Assignment 6.3
* File - phoneNumber.java
* This program will take a users input that includes letters and will convert the letters to reveal the full phone number.
*/
package assignment6_3;

import java.util.Scanner;

public class phoneNumber 
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		//Initializing my starting variables
		String number;
		int numberLength;
		String resultingNumber = "";
		
		System.out.print("Enter a phone number with letters:  ");
		
		//Forcing the users input to lower case for switching purposes
		number = scnr.nextLine().toLowerCase();
		
		//Finding the length of the users string
		numberLength = number.length();
		
		//Looping through the length of the users input
		for (int start = 0; start < numberLength; start++) 
		{
			//At each character it is checking the character and adding onto the resultingNumber
			char ch = number.charAt(start);
			
			if (Character.isLetter(ch)) 
            {
                switch(ch)
                {
	                case 'a' : 
	                case 'b' : 
	                case 'c' : 
	                	resultingNumber += "2";
	                	break;
	                case 'd' : 
	                case 'e' : 
	                case 'f' : 
	                	resultingNumber += "3"; 
	                	break;
	                case 'g' : 
	                case 'h' : 
	                case 'i' : 
	                	resultingNumber += "4"; 
	                	break;
	                case 'j' : 
	                case 'k' :
	                case 'l' : 
	                	resultingNumber += "5"; 
		                break;
	                case 'm' :
	                case 'n' : 
	                case 'o' :
	                	resultingNumber += "6"; 
	                	break;
	                case 'p' : 
	                case 'q' : 
	                case 'r' : 
	                case 's' :
	                	resultingNumber += "7"; 
	                	break;
	                case 't' : 
	                case 'u' : 
	                case 'v' :  
	                	resultingNumber += "8"; 
	                	break;
	                case 'w' : 
	                case 'x' : 
	                case 'y' : 
	                case 'z' : 
	                	resultingNumber += "9";
	                	break;
                }
            }
            else if (Character.isDigit(ch))
            {
            	resultingNumber += Character.getNumericValue(ch);
            }
			
			//Converting the character to a string so that I can see if the hyphen is present
            else if(Character.toString(ch).equals("-")) 
            {
            	resultingNumber += "-";
            }
		}
		
		System.out.print("\nThe full phone number would be: " + resultingNumber);
		
		//Trying to prevent any data leaks
		scnr.close();
	}

}
