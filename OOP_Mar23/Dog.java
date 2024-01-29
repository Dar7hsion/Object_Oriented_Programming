
public class Dog extends Animal
{
	//String breed
	String breed;
	
	//behavior
	public Dog(double w, double l, String n, String b) 
	{
		
		super(w, l, n);
		breed = b;
		species = "Dog";
		
	}
	
	public void fetch()
	{
		System.out.println("Brings the ball");
	}
	
	
	//fetch() //which also prints flavor text 
	public String toString()
	{
		
		String str = "";
		str = super.toString();
		str += "\nBreed: " + breed + "\n";
		return str;
		
	}
}
