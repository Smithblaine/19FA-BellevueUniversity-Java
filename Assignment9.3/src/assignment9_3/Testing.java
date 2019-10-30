/*
* Blaine Smith 
* 10-7-2019 
* Bellevue University
* Assignment 9.3
* File - Testing. java & MyRectanle.java
* This program makes use of objects and allows the user to create multiple objects and call on each objects information
* individually.
*/
package assignment9_3;

public class Testing 
{

	public static void main(String[] args) 
	{
		MyRectangle rectangle1 = new MyRectangle(3,8,"red");
		
		MyRectangle rectangle2 = new MyRectangle(5,8,"yellow");
		
		
		System.out.println("Rectangle one has a width of " + 
		rectangle1.getWidth() + ", a height of " + 
		rectangle1.getHeight() + ", and area of " + 
		rectangle1.findArea() + ", and a color of " + 
		rectangle1.getColor());
		
		System.out.println();
		
		System.out.println("Rectangle two has a width of " + 
		rectangle2.getWidth() + ", a height of " + 
		rectangle2.getHeight() + ", and area of " + 
		rectangle2.findArea() + ", and a color of " + 
		rectangle2.getColor());
	}

}
