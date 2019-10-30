/*
* Blaine Smith 
* 10-7-2019 
* Bellevue University
* Assignment 9.4
* File - MyStringTest.java
* This program takes in a string and then reverse the string and read from back to front.
*/
package assignment9_4;

public class MyStringTest 
{

	public static void main(String[] args) 
	{
		String starter = new String ("Hello world");
		
		int startLength = starter.length();
		
		System.out.println("Before reversing: " + starter);
		
		System.out.print("\nAfter reversing:  ");
		
		for (int i = starter.length()-1; i >= 0; i--) 
		{
			System.out.print(starter.charAt(i));
		}
	}

}
