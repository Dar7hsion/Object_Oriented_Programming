
public class Shape 
{
	//Shape is our superclass or parent class
	//everything it has can also be used by the children (unless labeled private)
	
	protected String color;
	protected boolean filled;
	//Point location
	protected Point location;
	
	public Shape(String c, boolean f)
	{
		color = c;
		filled = f;
	}
	
	public Shape(String c, boolean f, Point p)
	{
		color = c;
		filled =f;
		location = p;
	}
	
	public Shape()
	{
		
	}
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String c)
	{
		color = c;
	}
	
	public void setFilled(boolean f)
	{
		filled = f;
	}
	public boolean isFilled() // customarily use instead of get
	{
		return filled;
	}
	
	public String toString()
	{
		String str = "";
		str += "\nColor: " + color;
		str += "\nFilled: " + filled;
		return str;
	}
}

