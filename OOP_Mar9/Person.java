
public class Person 
{	
	//Attributes
	
	//name
	//age
	//weight
	//height
	//BMI
	
	//Behaviors
	//getters and setters //skip except BMI
	
	//toString
	
	private String name;
	private double age;
	private double weight;
	private double height;
	private BMI bmi;
	//-------------//
	public Person(String n, double a, double w, double h)
	{
		name = n;
		age = a;
		height = h;
		weight = w;
		bmi = new BMI(height, weight);
	}
	//-------------//
	public BMI getBMI()
	{
		return bmi;
	}
	public void setBMI(double h, double w)
	{
		height = h;
		weight = w;
		bmi = new BMI(height, weight);
	}
	//-------------//
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	//-------------//
	public double getAge()
	{
		return age;
	}
	public void setAge(double a)
	{
		age = a;
	}
	//-------------//
	public double getWeight()
	{
		return weight;
	}
	public void setWeigh(double w)
	{
		weight = w;
	}
	//-------------//
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	//-------------//
	
	public String toString()
	{
		String str = "";
		str += "\nName: " + name;
		str += "\nAge: " + age;
		str += "\nWeight: " + weight;
		str += "\nHeight: " + height;
		str += "\nBMI: " + bmi + "\n";
		return str;
	}
	
}
