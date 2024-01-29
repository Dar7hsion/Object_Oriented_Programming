
public class PracticeNotesSphere 
{
	//Attribute
	//Note: private makes the attribute unchangeable, noted by a "-". 
	//Note: public makes the attribute changeable, noted by a "+".
	//note: "#" represents protected 
	private int radius;
	private double circumference;
	private double Volume;
	private double sufaceArea;
	
	//next we create our constructor
	//a constructor is a method used to create a new variable of this type
	//a constructor has the same name as the class its in
	public PracticeNotesSphere(int r)
	{
		radius = r;
		calcVolume();
		calcCircumference();
		calcsufacearea();
	}
	
	
	public void setRadius(int r)// lets use change the radius
	{
		radius = r;
		calcVolume();
		calcCircumference();
		calcsufacearea();
	}
	public int getRadius()// see and use without changing the value 
	{
		return radius;
	}
	
	
	public void calcVolume()
	{ 
		Volume = (4/3)*Math.PI*(radius*radius*radius);
	}
	public double getVolume()// see and use without changing the value 
	{
		return Volume;
	}
	
	
	public void calcCircumference()
	{
		circumference = 4*Math.PI*(radius*radius);
	}
	public double getCircumference()// see and use without changing the value 
	{
		return circumference;
	}
	
	
	public void calcsufacearea()
	{
		sufaceArea = 2*Math.PI*radius;
	}
	public double getSufacearea()// see and use without changing the value 
	{
		return sufaceArea;
	}
	
	
	public String toString()
	{
		String str = "";
		str += "radius: " + radius;
		str += "\nCircumference: " + circumference;
		str += "\nVolume: " + Volume;
		return str;
	}
	
	
}
