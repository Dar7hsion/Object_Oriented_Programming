
public class Person 
{
	protected String Name;
	protected Address add;
	
	public Person(String na, int n, String s)
	{
		add = new Address(n, s);
		Name = na;
	}
	
	
	public String getName()
	{
		return Name;
	}
	public void setName(String n)
	{
		Name = n;
	}
	
	public Address getAddress()
	{
		return add;
	}
	public void setAddress(String s, int n)
	{
		add.setNumber(n);
		add.setStreet(s);
	}
	
	public String toString()
	{
		String str = "";
		str += "\n Name: " + Name;
		str += "\n Address: " + add;
		return str;
	}
	
	
 
}
