
public class Square extends Shape
{
	//set up square similar to how we did circle
	//use private for all attributes
	//and public for all behaviors
	//for each private attributes
	//create 1 getter and 1 setter method 
	
	private int width;
	private int area;
	private int perimeter;
	
	public Square (int w)
	{
		width = w;
		calArea();
		calPerimeter();
	}
	public Square(int w, String c, boolean f)
	{
		super(c, f); // calls the constructor of the super class
		width = w;
		calArea();
		calPerimeter();
	}
	
	public void setWidth(int w)
	{
		width = w;
		calArea();
		calPerimeter();
	}
	
	public int getArea()
	{
		return area;
	}
	
	public int getPerimeter()
	{
		return perimeter;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void calArea()
	{
		area = width*width;
	}
	
	public void calPerimeter()
	{
		perimeter = width * 4;
	}
	
	public String toString()
	{
		String str = "";
		str += "Width: " + width;
		str += "\nPerimeter: " + perimeter;
		str += "\nArea: " + area;
		str += "\nColor: " + color;
		str += "\nFilled: " + filled;
		return str;
	}

}
