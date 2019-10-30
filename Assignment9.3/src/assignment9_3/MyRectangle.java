package assignment9_3;

public class MyRectangle 
{

	  private double width = 1.0;
	  private double height = 1.0;
	  private static String color = "white";
	
	  public MyRectangle()
	  { 
		  
	  }
	
	  public MyRectangle(double widthParam, double heightParam, String colorParam)
	  { 
		  width = widthParam;
		  height = heightParam;
		  color = colorParam;
	  }
	
	  public double getWidth()
	  { 
		  return width;
	  }
	
	  public void setWidth(double widthParam)
	  { 
		  width = widthParam;
	  }
	
	  public double getHeight()
	  { 
		  return height;
	  }
	
	  public void setHeight(double heightParam)
	  { 
		  height = heightParam;
	  }
	
	  public String getColor()
	  { 
		  return color;
	  }  
	
	  public static void setColor(String colorParam)
	  { 
		  color = colorParam;
	  }
	
	  public double findArea()
	  { 
		  return width * height;
	  }

}
