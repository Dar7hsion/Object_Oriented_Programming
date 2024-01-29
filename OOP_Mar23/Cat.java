
public class Cat extends Animal
{

	//String coloration
	String coloration;
	
	
	//behavior
	public Cat(double w, double l, String n, String c) 
	{
		
		super(w, l, n);
		coloration = c;
		species = "Cat";
	}
	
	public void loaf()
	{
		System.out.println("if it fits, it sits");
	}
	//loaf()//which print flavor text

	public String toString()
	{
		
		String str = "";
		str = super.toString();
		str += "\nColoration: " + coloration + "\n";
		return str;
	}
}
