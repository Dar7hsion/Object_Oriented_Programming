
public class Animal 
{
	String name;
	double weight;
	double lenght;
	
	public Animal(String n, double w, double l)
	{
		name = n;
		weight = w;
		lenght =l;
	}
	
	public void speak()
	{
		System.out.println("Hello");
	}
	
	public String toString()
	{
		return name + " " + weight + " " + lenght;
	}
}
