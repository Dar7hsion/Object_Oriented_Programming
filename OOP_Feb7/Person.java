
public class Person 
{
	String name;
	Animal pet;//This custom object is now an attribute of the new person object
	//this is aggregation, the animal exist outside of this person, however this person has an animal
	
	public Person(String n, Animal p)
	{
		name = n;
		pet = p;
	}
	public String toString()
	{
		return name + " " + pet;
	}
}
