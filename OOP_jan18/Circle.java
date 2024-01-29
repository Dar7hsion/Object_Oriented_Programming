
public class Circle extends Shape
{
	//first you define the attribute;
	//making to 
	private int radius;
	private double circumference;
	private double area; 
	
	//next we create our constructor
	//a constructor is a method used to create a new variable of this type
	//a constructor has the same name as the class its in
	
	public Circle(int r)
	{
		radius = r;
		calcArea();
		calcCircumference();
	}
	
	public void setRadius(int r)
	{
		radius = r;
		calcArea();
		calcCircumference();
	}
	
	public double getArea()// see and use without changing the value 
	{
		return area;
	}
	
	public void calcArea()
	{
		area = Math.PI*radius*radius;
	}
	
	public void calcCircumference()
	{
		circumference = 2*Math.PI*radius;
	}
	
	public String toString()
	{
		String str = "";
		str += "radius: " + radius;
		str += "\nCircumference: " + circumference;
		str += "\nArea: " + area;
		str += "\nColor: " + color;
		str += "\nFilled: " + filled;
		return str;
	}
}
