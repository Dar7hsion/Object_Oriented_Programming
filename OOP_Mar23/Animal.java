
public abstract class Animal 
{
	
	//Attributes
	//double weight
	//double lenght
	//String name
	//String species
	double weight;
	double lenght;
	String name;
	String species;
	
	//behaviors
	public Animal(double w, double l, String n)
	{
		
		weight = w;
		lenght = l;
		name = n;
	}
	//toString
	
	public String toString()
	{
		
		String str = "";
		str += "\nWeight: " + weight;
		str += "\nLenght: " + lenght;
		str += "\nName: " + name;
		str += "\nSpecies: " + species;
		return str;
	}
}
